package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);*/

        Forum forumAudii = new Forum();
       // System.out.println(forumAudii.getUserList());




        Map<Integer, ForumUser> theResultMapOfUser = forumAudii.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> 2020 - user.getDateOfBirth().getYear() >= 20)
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getID, ForumUser -> ForumUser));

        System.out.println("# elements: " + theResultMapOfUser.size());             // [2]
        theResultMapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().getUserName() + " Born: " +
                        entry.getValue().getDateOfBirth() + " number of posts: " + entry.getValue().getNumberOfPosts())                   // [3]
                .forEach(System.out::println);
    }
}