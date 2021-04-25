package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class ManyToManyFacadeTest {
    @Autowired
    private ManyToManyFacade manyToManyFacade;

    @Test
    void testSerachByNameEmployee() {
        //Given
        String searchedName = "Smit";
        List<Employee> foundNames = new ArrayList<>();
        //When
        try {
            foundNames = manyToManyFacade.findEmployee(searchedName);
            foundNames.stream()
                    .map(s -> s.getLastname())
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Then
        assertEquals(4, foundNames.size());
    }
    @Test
    void testSerachByNameNotFoundEmployee() {
        //Given
        String searchedName = "Smith33";
        List<Employee> foundNames = new ArrayList<>();
        //When
        try {
            foundNames = manyToManyFacade.findEmployee(searchedName);
            foundNames.stream()
                    .map(s -> s.getLastname())
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Then
        assertEquals(0, foundNames.size());
    }

    @Test
    void testSerachByCompanyByPartialName() {
        //Given
        String searchedName = "at";
        List<Company> foundNames = new ArrayList<>();
        //When
        try {
            foundNames = manyToManyFacade.findCompany(searchedName);
            foundNames.stream()
                    .map(s -> s.getName())
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Then
        assertEquals(8, foundNames.size());

    }

}
