package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private double numberOfTheForumUsers;
    private double numberOfTheForumPosts;
    private double numberOfTheForumComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;
    private String result;


    public String calculateAdvStatistics(Statistics statistics) {

        if(statistics.usersNames().size() != 0) {
            this.numberOfTheForumUsers = statistics.usersNames().size();

            if (statistics.postsCount() > 0) {
                this.numberOfTheForumPosts = statistics.postsCount();
            } else {
                this.numberOfTheForumPosts = 0;
            }

            if (statistics.postsCount() > 0) {
                this.numberOfTheForumComments = statistics.commentsCount();
            } else {
                this.numberOfTheForumComments = 0;
            }

            if (statistics.postsCount() > 0) {
                this.averageNumberOfPostsPerUser = this.numberOfTheForumPosts / this.numberOfTheForumUsers;
            } else {
                this.averageNumberOfPostsPerUser = 0;
            }

            if (statistics.postsCount() > 0) {
                this.averageNumberOfCommentsPerUser = this.numberOfTheForumComments / this.numberOfTheForumUsers;
            } else {
                this.averageNumberOfCommentsPerUser = 0;
            }

            if (statistics.postsCount() > 0) {
                this.averageNumberOfCommentsPerPost = (this.numberOfTheForumComments / this.numberOfTheForumPosts);
            } else {
                this.averageNumberOfCommentsPerPost = 0;
            }
        } else {

            this.numberOfTheForumUsers = 0;
            this.numberOfTheForumPosts = 0;
            this.numberOfTheForumComments = 0;
            this.averageNumberOfPostsPerUser = 0;
            this.averageNumberOfCommentsPerUser = 0;
            this.averageNumberOfCommentsPerPost = 0;
        }

        this.result = this.numberOfTheForumUsers + " "
                + this.numberOfTheForumPosts + " "
                + this.numberOfTheForumComments + " "
                + this.averageNumberOfPostsPerUser + " "
                + this.averageNumberOfCommentsPerUser + " "
                + this.averageNumberOfCommentsPerPost;

        return result;
    }

   void showStatistics() {

       System.out.println("FORUM STATISTICS: ");
       System.out.println("  Number of the forum users: " + this.numberOfTheForumUsers);
       System.out.println("  Number of the forum posts: " + this.numberOfTheForumPosts);
       System.out.println("  Number of the forum comments: " + this.numberOfTheForumComments);
       System.out.println("  Average number of the posts per user: " + this.averageNumberOfPostsPerUser);
       System.out.println("  Average number of the comments per user: " + this.averageNumberOfCommentsPerUser);
       System.out.println("  Average number of the comments per post: " + this.averageNumberOfCommentsPerPost);
   }
}
