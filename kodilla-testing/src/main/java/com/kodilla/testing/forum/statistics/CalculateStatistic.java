package com.kodilla.testing.forum.statistics;

public class CalculateStatistic {

    public int postCount;
    public int commentsCount;
    public double avgPostsPerUser;
    public double avgCommentsPerUser;
    public double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics == null) {
            System.out.println("Przeslana baza jest pusta");
        } else {
            postCount = statistics.postsCount();
            commentsCount = statistics.commentsCount();
            if (statistics.usersNames().size() == 0) {
                avgPostsPerUser = 0;
                avgCommentsPerUser = 0;
                System.out.print("Liczba uzytkownikow 0 nie mozna wykonac dzielenia");
            } else {
                avgPostsPerUser = (double)statistics.postsCount() / statistics.usersNames().size();
                avgCommentsPerUser = (double)statistics.commentsCount() / statistics.usersNames().size();
            }

            if (statistics.postsCount() == 0) {
                avgCommentsPerPost = 0;
                System.out.print("Liczba postów 0 nie mozna wykonac dzielenia");
            } else {
                avgCommentsPerPost = (double)statistics.commentsCount() / statistics.postsCount();
            }
        }
    }

    public void showStatistics() {
        System.out.print(postCount);
        System.out.print(commentsCount);
        System.out.print(avgPostsPerUser);
        System.out.print(avgCommentsPerUser);
        System.out.print(avgCommentsPerPost);

    }

}
