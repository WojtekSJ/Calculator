package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@Service
public class ManyToManyFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);
    @Autowired
    public ManyToManyFacade(CompanyDao companyDao, EmployeeDao employeDao) {
        this.companyDao = companyDao;
        this.employeDao = employeDao;
    }

    public List<Employee> findEmployee(String searchedName) throws ManyToManyException{
        List<Employee> result = employeDao.retrieveEmployeeWithPartialName(searchedName);
       if (result.size()==0) {
           LOGGER.error(ManyToManyException.ERR_EMPLOYEE_NOT_FOUND);
        throw new ManyToManyException(ManyToManyException.ERR_EMPLOYEE_NOT_FOUND);

       }
        return result;
    }
    public List<Company> findCompany(String searchedName) throws ManyToManyException{
        List<Company> result = companyDao.retrieveByCompanyFragment(searchedName);
        if (result.size()==0) {
            LOGGER.error(ManyToManyException.ERR_COMPANY_NOT_FOUND);
            throw new ManyToManyException(ManyToManyException.ERR_COMPANY_NOT_FOUND);
        }
        return result;
    }
}
