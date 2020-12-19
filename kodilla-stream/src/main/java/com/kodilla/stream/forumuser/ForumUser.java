package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int ID;
    private String userName;
    private char gender;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int ID, String userName, char gender, LocalDate dateOfBirth, int numberOfPosts) {
        this.ID = ID;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender(){
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString(){
        return "Uzytkownik: " + ID + " User name: " + userName + " Urodzony: " + dateOfBirth;
    }

    @Override
    public int hashCode() {
        return this.ID;
    }

    @Override
    public boolean equals(Object o) {
        final ForumUser e = (ForumUser) o;
        return this.ID==e.ID;
    }
}
