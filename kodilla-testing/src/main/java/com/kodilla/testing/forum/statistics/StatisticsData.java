package com.kodilla.testing.forum.statistics;

public final class StatisticsData {

    private final double numberOfTheForumUsers;
    private final double numberOfTheForumPosts;
    private final double numberOfTheForumComments;
    private final double averageNumberOfPostsPerUser;
    private final double averageNumberOfCommentsPerUser;
    private final double averageNumberOfCommentsPerPost;

    public StatisticsData(double numberOfTheForumUsers, double numberOfTheForumPosts, double numberOfTheForumComments, double averageNumberOfPostsPerUser, double averageNumberOfCommentsPerUser, double averageNumberOfCommentsPerPost) {

        this.numberOfTheForumUsers = numberOfTheForumUsers;
        this.numberOfTheForumPosts = numberOfTheForumPosts;
        this.numberOfTheForumComments = numberOfTheForumComments;
        this.averageNumberOfPostsPerUser = averageNumberOfPostsPerUser;
        this.averageNumberOfCommentsPerUser = averageNumberOfCommentsPerUser;
        this.averageNumberOfCommentsPerPost = averageNumberOfCommentsPerPost;
    }

    public double getNumberOfTheForumUsers() {
        return numberOfTheForumUsers;
    }

    public double getNumberOfTheForumPosts() {
        return numberOfTheForumPosts;
    }

    public double getNumberOfTheForumComments() {
        return numberOfTheForumComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    @Override
    public String toString() {
        return  "numberOfTheForumUsers=" + numberOfTheForumUsers +
                ", numberOfTheForumPosts=" + numberOfTheForumPosts +
                ", numberOfTheForumComments=" + numberOfTheForumComments +
                ", averageNumberOfPostsPerUser=" + averageNumberOfPostsPerUser +
                ", averageNumberOfCommentsPerUser=" + averageNumberOfCommentsPerUser +
                ", averageNumberOfCommentsPerPost=" + averageNumberOfCommentsPerPost;
    }
}
