package com.kodilla.hibernate.manytomany.facade;

public class EmployeeDto {
   private String lastname;

    public EmployeeDto(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }
}
