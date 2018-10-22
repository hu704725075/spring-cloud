package com.cloud.user.pojo;

import java.util.Date;

public class Comment {
    /**
     * 用户评论ID
     */
    private Integer commentId;

    /**
     * 评论类型
     */
    private Integer commentTypeId;

    /**
     * 评论内容
     */
    private String commentContext;

    /**
     * 向用户评论ID
     */
    private Integer commentToUserId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 活动ID
     */
    private Integer activityId;

    /**
     * 评论时间
     */
    private Date commentCreateTime;

    /**
     * 评论更新时间
     */
    private Date commentUpdateTime;

    /**
     * 是否有效  1 有效  0无效
     */
    private Integer isVaild;

    /**
     * 用户评论ID
     * @return comment_id 用户评论ID
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * 用户评论ID
     * @param commentId 用户评论ID
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * 评论类型
     * @return comment_type_id 评论类型
     */
    public Integer getCommentTypeId() {
        return commentTypeId;
    }

    /**
     * 评论类型
     * @param commentTypeId 评论类型
     */
    public void setCommentTypeId(Integer commentTypeId) {
        this.commentTypeId = commentTypeId;
    }

    /**
     * 评论内容
     * @return comment_context 评论内容
     */
    public String getCommentContext() {
        return commentContext;
    }

    /**
     * 评论内容
     * @param commentContext 评论内容
     */
    public void setCommentContext(String commentContext) {
        this.commentContext = commentContext == null ? null : commentContext.trim();
    }

    /**
     * 向用户评论ID
     * @return comment_to_user_id 向用户评论ID
     */
    public Integer getCommentToUserId() {
        return commentToUserId;
    }

    /**
     * 向用户评论ID
     * @param commentToUserId 向用户评论ID
     */
    public void setCommentToUserId(Integer commentToUserId) {
        this.commentToUserId = commentToUserId;
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 活动ID
     * @return activity_id 活动ID
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * 活动ID
     * @param activityId 活动ID
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 评论时间
     * @return comment_create_time 评论时间
     */
    public Date getCommentCreateTime() {
        return commentCreateTime;
    }

    /**
     * 评论时间
     * @param commentCreateTime 评论时间
     */
    public void setCommentCreateTime(Date commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    /**
     * 评论更新时间
     * @return comment_update_time 评论更新时间
     */
    public Date getCommentUpdateTime() {
        return commentUpdateTime;
    }

    /**
     * 评论更新时间
     * @param commentUpdateTime 评论更新时间
     */
    public void setCommentUpdateTime(Date commentUpdateTime) {
        this.commentUpdateTime = commentUpdateTime;
    }

    /**
     * 是否有效  1 有效  0无效
     * @return is_vaild 是否有效  1 有效  0无效
     */
    public Integer getIsVaild() {
        return isVaild;
    }

    /**
     * 是否有效  1 有效  0无效
     * @param isVaild 是否有效  1 有效  0无效
     */
    public void setIsVaild(Integer isVaild) {
        this.isVaild = isVaild;
    }
}