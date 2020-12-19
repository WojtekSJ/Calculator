package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1234,"Mirek", 'M', LocalDate.of(2000, 1, 4), 30));
        listOfUsers.add(new ForumUser(3425,"Aleks", 'M', LocalDate.of(2012, 5, 6), 0));
        listOfUsers.add(new ForumUser(2111,"Elvira", 'F', LocalDate.of(1999, 2, 1), 0));
        listOfUsers.add(new ForumUser(5789,"Vlad", 'M', LocalDate.of(1985, 11, 2), 1));
        listOfUsers.add(new ForumUser(4548,"Anna", 'F', LocalDate.of(1987, 12, 4), 2));
        listOfUsers.add(new ForumUser(4564,"Jarek", 'M', LocalDate.of(1965, 7, 7), 0));
        listOfUsers.add(new ForumUser(2434,"Lukasz", 'M', LocalDate.of(1998, 2, 11), 15));
        listOfUsers.add(new ForumUser(3242,"Ramona", 'F', LocalDate.of(2008, 4, 12), 150));
        listOfUsers.add(new ForumUser(1268,"Czeslaw", 'M', LocalDate.of(2004, 1, 5), 11));


    }

    public List<ForumUser> getUserList() {
        return listOfUsers;
    }
}
