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
        StatisticsData statisticsData = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertTrue(statisticsData.getNumberOfTheForumUsers() == 2.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumPosts() == 0.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumComments() == 0.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfPostsPerUser() == 0.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerUser() == 0.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerPost() == 0.0);

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
        StatisticsData statisticsData = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertTrue(statisticsData.getNumberOfTheForumUsers() == 2.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumPosts() == 1000.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumComments() == 2000.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfPostsPerUser() == 500.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerUser() == 1000.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerPost() == 2.0);
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
        StatisticsData statisticsData = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertTrue(statisticsData.getNumberOfTheForumUsers() == 2.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumPosts() == 20.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumComments() == 0.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfPostsPerUser() == 10.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerUser() == 0.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerPost() == 0.0);
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
        StatisticsData statisticsData = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertTrue(statisticsData.getNumberOfTheForumUsers() == 2.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumPosts() == 20.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumComments() == 10.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfPostsPerUser() == 10.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerUser() == 5.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerPost() == 0.5);
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
        StatisticsData statisticsData = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertTrue(statisticsData.getNumberOfTheForumUsers() == 2.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumPosts() == 10.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumComments() == 20.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfPostsPerUser() == 5.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerUser() == 10.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerPost() == 2.0);
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
        StatisticsData statisticsData = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertTrue(statisticsData.getNumberOfTheForumUsers() == 0.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumPosts() == 0.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumComments() == 0.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfPostsPerUser() == 0.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerUser() == 0.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerPost() == 0.0);
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
        StatisticsData statisticsData = forumStatistics.calculateAdvStatistics(statisticsMock);

        //then
        Assert.assertTrue(statisticsData.getNumberOfTheForumUsers() == 1000.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumPosts() == 1000.0);
        Assert.assertTrue(statisticsData.getNumberOfTheForumComments() == 2000.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfPostsPerUser() == 1.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerUser() == 2.0);
        Assert.assertTrue(statisticsData.getAverageNumberOfCommentsPerPost() == 2.0);
    }
}
