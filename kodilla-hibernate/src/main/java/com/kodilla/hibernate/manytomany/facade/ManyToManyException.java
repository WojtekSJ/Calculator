package com.kodilla.hibernate.manytomany.facade;

public class ManyToManyException extends Exception{
    public static String ERR_COMPANY_NOT_FOUND = "Application was not able to find company";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found";

    public ManyToManyException(String message) {
        super(message);
    }
}
