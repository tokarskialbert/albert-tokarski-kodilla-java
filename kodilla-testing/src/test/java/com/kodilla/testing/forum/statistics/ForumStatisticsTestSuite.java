package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ForumStatisticsTestSuite {

    private static int counter = 0;

    @Before
    public void before() {

        counter++;
        System.out.println("");
        System.out.println("Starting test " + counter);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIsNoPosts() {

        //given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        List<String> usersNameList = new ArrayList<String>();
            usersNameList.add("user1");
            usersNameList.add("user2");

        Mockito.when(statisticsMock.usersNames()).thenReturn(usersNameList);
        Mockito.when(statisticsMock.postsCount()).thenReturn(0);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(0);

        //when
        String myResult = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertEquals("2.0 0.0 0.0 0.0 0.0 0.0", myResult);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIs1000Posts() {

        //given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        List<String> usersNameList = new ArrayList<String>();
        usersNameList.add("user1");
        usersNameList.add("user2");

        Mockito.when(statisticsMock.usersNames()).thenReturn(usersNameList);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(2000);

        //when
        String myResult = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertEquals("2.0 1000.0 2000.0 500.0 1000.0 2.0", myResult);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIsNoComments() {

        //given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        List<String> usersNameList = new ArrayList<String>();
        usersNameList.add("user1");
        usersNameList.add("user2");

        Mockito.when(statisticsMock.usersNames()).thenReturn(usersNameList);
        Mockito.when(statisticsMock.postsCount()).thenReturn(20);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(0);

        //when
        String myResult = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertEquals("2.0 20.0 0.0 10.0 0.0 0.0", myResult);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIsLessCommentsThanPosts() {

        //given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        List<String> usersNameList = new ArrayList<String>();
        usersNameList.add("user1");
        usersNameList.add("user2");

        Mockito.when(statisticsMock.usersNames()).thenReturn(usersNameList);
        Mockito.when(statisticsMock.postsCount()).thenReturn(20);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(10);

        //when
        String myResult = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertEquals("2.0 20.0 10.0 10.0 5.0 0.5", myResult);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIsMoreCommentsThanPosts() {

        //given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        List<String> usersNameList = new ArrayList<String>();
        usersNameList.add("user1");
        usersNameList.add("user2");

        Mockito.when(statisticsMock.usersNames()).thenReturn(usersNameList);
        Mockito.when(statisticsMock.postsCount()).thenReturn(10);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(20);

        //when
        String myResult = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertEquals("2.0 10.0 20.0 5.0 10.0 2.0", myResult);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIsNoUsers() {

        //given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        List<String> usersNameList = new ArrayList<String>();

        Mockito.when(statisticsMock.usersNames()).thenReturn(usersNameList);
        Mockito.when(statisticsMock.postsCount()).thenReturn(10);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(20);

        //when
        String myResult = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertEquals("0.0 0.0 0.0 0.0 0.0 0.0", myResult);
    }

    @Test
    public void testCalculateAdvStatisticsWhenThereIs1000Users() {

        //given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);

        List<String> usersNameList = new ArrayList<String>();
        for(int i = 1; i < 1001; i++) {
            usersNameList.add("user" + i);
        }

        Mockito.when(statisticsMock.usersNames()).thenReturn(usersNameList);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(2000);

        //when
        String myResult = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertEquals("1000.0 1000.0 2000.0 1.0 2.0 2.0", myResult);
    }
}
