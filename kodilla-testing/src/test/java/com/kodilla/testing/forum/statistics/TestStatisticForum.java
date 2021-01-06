package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestStatisticForum {

    @Mock
    private Statistics StatisticMock;
    //Testowanie
    @Test
    void testInitialTest() {                                      // [2]

        // Given
        CalculateStatistic testCalculate = new CalculateStatistic();                  // [3]
        List<String> usersForum = new ArrayList<>();                                // [4]
        usersForum.add("Mirek");                                                    // [9]
        usersForum.add("Ada");                                                    // [10]
        usersForum.add("Arek");                                                    // [11]
        usersForum.add("Wojtek");                                                    // [12]
        when(StatisticMock.postsCount()).thenReturn(1300);// [13]
        when(StatisticMock.commentsCount()).thenReturn(2600);// [13]
        when(StatisticMock.usersNames()).thenReturn(usersForum);// [13]

        // When
        testCalculate.calculateAdvStatistics(StatisticMock);

        // Then
        assertEquals(1300, testCalculate.postCount);
        assertEquals(2600, testCalculate.commentsCount);
        assertEquals(2.0, testCalculate.avgCommentsPerPost);
        assertEquals(650, testCalculate.avgCommentsPerUser);
        assertEquals(325, testCalculate.avgPostsPerUser);
    }

    @Test
    void testPostZero() {                                      // [2]
        // Given
        CalculateStatistic testCalculate = new CalculateStatistic();                  // [3]
        List<String> usersForum = new ArrayList<>();                                // [4]
        usersForum.add("Mirek");                                                    // [9]
        usersForum.add("Ada");                                                    // [10]
        usersForum.add("Arek");                                                    // [11]
        usersForum.add("Wojtek");                                                    // [12]
        when(StatisticMock.postsCount()).thenReturn(0);// [13]
        when(StatisticMock.commentsCount()).thenReturn(2600);// [13]
        when(StatisticMock.usersNames()).thenReturn(usersForum);// [13]
        // When
        testCalculate.calculateAdvStatistics(StatisticMock);
        // Then
        assertEquals(0, testCalculate.postCount);
        assertEquals(2600, testCalculate.commentsCount);
        assertEquals(0, testCalculate.avgCommentsPerPost);
        assertEquals(650, testCalculate.avgCommentsPerUser);
        assertEquals(0, testCalculate.avgPostsPerUser);
    }
    @Test
    void testPostThousend() {                                      // [2]
        // Given
        CalculateStatistic testCalculate = new CalculateStatistic();                  // [3]
        List<String> usersForum = new ArrayList<>();                                // [4]
        usersForum.add("Mirek");                                                    // [9]
        usersForum.add("Ada");                                                    // [10]
        usersForum.add("Arek");                                                    // [11]
        usersForum.add("Wojtek");                                                    // [12]
        when(StatisticMock.postsCount()).thenReturn(1000);// [13]
        when(StatisticMock.commentsCount()).thenReturn(2600);// [13]
        when(StatisticMock.usersNames()).thenReturn(usersForum);// [13]
        // When
        testCalculate.calculateAdvStatistics(StatisticMock);
        // Then
        assertEquals(1000, testCalculate.postCount);
        assertEquals(2600, testCalculate.commentsCount);
        assertEquals(2.6, testCalculate.avgCommentsPerPost);
        assertEquals(650, testCalculate.avgCommentsPerUser);
        assertEquals(250, testCalculate.avgPostsPerUser);
    }
    @Test
    void testCommentsZero() {                                      // [2]
        // Given
        CalculateStatistic testCalculate = new CalculateStatistic();                  // [3]
        List<String> usersForum = new ArrayList<>();                                // [4]
        usersForum.add("Mirek");                                                    // [9]
        usersForum.add("Ada");                                                    // [10]
        usersForum.add("Arek");                                                    // [11]
        usersForum.add("Wojtek");                                                    // [12]
        when(StatisticMock.postsCount()).thenReturn(1000);// [13]
        when(StatisticMock.commentsCount()).thenReturn(0);// [13]
        when(StatisticMock.usersNames()).thenReturn(usersForum);// [13]
        // When
        testCalculate.calculateAdvStatistics(StatisticMock);
        // Then
        assertEquals(1000, testCalculate.postCount);
        assertEquals(0, testCalculate.commentsCount);
        assertEquals(0, testCalculate.avgCommentsPerPost);
        assertEquals(0, testCalculate.avgCommentsPerUser);
        assertEquals(250, testCalculate.avgPostsPerUser);
    }
    @Test
    void testCommentsLessThanPosts() {                                      // [2]
        // Given
        CalculateStatistic testCalculate = new CalculateStatistic();                  // [3]
        List<String> usersForum = new ArrayList<>();                                // [4]
        usersForum.add("Mirek");                                                    // [9]
        usersForum.add("Ada");                                                    // [10]
        usersForum.add("Arek");                                                    // [11]
        usersForum.add("Wojtek");                                                    // [12]
        when(StatisticMock.postsCount()).thenReturn(1000);// [13]
        when(StatisticMock.commentsCount()).thenReturn(250);// [13]
        when(StatisticMock.usersNames()).thenReturn(usersForum);// [13]
        // When
        testCalculate.calculateAdvStatistics(StatisticMock);
        // Then
        assertEquals(1000, testCalculate.postCount);
        assertEquals(250, testCalculate.commentsCount);
        assertEquals(0.25, testCalculate.avgCommentsPerPost);
        assertEquals(62.5, testCalculate.avgCommentsPerUser);
        assertEquals(250, testCalculate.avgPostsPerUser);
    }
    @Test
    void testCommentsMoreThanPosts() {                                      // [2]
        // Given
        CalculateStatistic testCalculate = new CalculateStatistic();                  // [3]
        List<String> usersForum = new ArrayList<>();                                // [4]
        usersForum.add("Mirek");                                                    // [9]
        usersForum.add("Ada");                                                    // [10]
        usersForum.add("Arek");                                                    // [11]
        usersForum.add("Wojtek");                                                    // [12]
        when(StatisticMock.postsCount()).thenReturn(1000);// [13]
        when(StatisticMock.commentsCount()).thenReturn(2500);// [13]
        when(StatisticMock.usersNames()).thenReturn(usersForum);// [13]
        // When
        testCalculate.calculateAdvStatistics(StatisticMock);
        // Then
        assertEquals(1000, testCalculate.postCount);
        assertEquals(2500, testCalculate.commentsCount);
        assertEquals(2.5, testCalculate.avgCommentsPerPost);
        assertEquals(625, testCalculate.avgCommentsPerUser);
        assertEquals(250, testCalculate.avgPostsPerUser);
    }
    @Test
    void testUsersCountZero() {                                      // [2]
        // Given
        CalculateStatistic testCalculate = new CalculateStatistic();                  // [3]
        List<String> usersForum = new ArrayList<>();                                // [4]
                                                     // [12]
        when(StatisticMock.postsCount()).thenReturn(1000);// [13]
        when(StatisticMock.commentsCount()).thenReturn(2500);// [13]
        when(StatisticMock.usersNames()).thenReturn(usersForum);// [13]
        // When
        testCalculate.calculateAdvStatistics(StatisticMock);
        // Then
        assertEquals(1000, testCalculate.postCount);
        assertEquals(2500, testCalculate.commentsCount);
        assertEquals(2.5, testCalculate.avgCommentsPerPost);
        assertEquals(0, testCalculate.avgCommentsPerUser);
        assertEquals(0, testCalculate.avgPostsPerUser);
    }

    @Test
    void testUsersCountHundred() {                                      // [2]
        // Given
        CalculateStatistic testCalculate = new CalculateStatistic();                  // [3]
        List<String> usersForum = new ArrayList<>();
        for (int i =0; i<100; i++) {
            usersForum.add("Mirek" + i);                                                    // [9]
        }          // [12]
        when(StatisticMock.postsCount()).thenReturn(1000);// [13]
        when(StatisticMock.commentsCount()).thenReturn(1300);// [13]
        when(StatisticMock.usersNames()).thenReturn(usersForum);// [13]
        // When
        testCalculate.calculateAdvStatistics(StatisticMock);
        // Then
        assertEquals(1000, testCalculate.postCount);
        assertEquals(1300, testCalculate.commentsCount);
        assertEquals(1.3, testCalculate.avgCommentsPerPost);
        assertEquals(13, testCalculate.avgCommentsPerUser);
        assertEquals(10, testCalculate.avgPostsPerUser);
    }

}
