package com.cloud.user.pojo;

import java.util.Date;

public class UserAcct {
    /**
     * 
     */
    private Integer userAcctId;

    /**
     * 业务来源类型
     */
    private String userSourceType;

    /**
     * 业务来源号(open ID)
     */
    private Integer userSouceCode;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 性别  0 女性   1男性
     */
    private Integer userGender;

    /**
     * 用户昵称 
     */
    private String userNick;

    /**
     * 用户头像
     */
    private String userImg;

    /**
     * 省
     */
    private String userProvince;

    /**
     * 市
     */
    private String userCity;

    /**
     * 区
     */
    private String userArea;

    /**
     * 用户类型
     */
    private Integer userTypeId;

    /**
     * 创建人ID
     */
    private Integer createUserId;

    /**
     * 更新人ID
     */
    private Integer updateUserId;

    /**
     * 生成时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 
     * @return user_acct_id 
     */
    public Integer getUserAcctId() {
        return userAcctId;
    }

    /**
     * 
     * @param userAcctId 
     */
    public void setUserAcctId(Integer userAcctId) {
        this.userAcctId = userAcctId;
    }

    /**
     * 业务来源类型
     * @return user_source_type 业务来源类型
     */
    public String getUserSourceType() {
        return userSourceType;
    }

    /**
     * 业务来源类型
     * @param userSourceType 业务来源类型
     */
    public void setUserSourceType(String userSourceType) {
        this.userSourceType = userSourceType == null ? null : userSourceType.trim();
    }

    /**
     * 业务来源号(open ID)
     * @return user_souce_code 业务来源号(open ID)
     */
    public Integer getUserSouceCode() {
        return userSouceCode;
    }

    /**
     * 业务来源号(open ID)
     * @param userSouceCode 业务来源号(open ID)
     */
    public void setUserSouceCode(Integer userSouceCode) {
        this.userSouceCode = userSouceCode;
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
     * 性别  0 女性   1男性
     * @return user_gender 性别  0 女性   1男性
     */
    public Integer getUserGender() {
        return userGender;
    }

    /**
     * 性别  0 女性   1男性
     * @param userGender 性别  0 女性   1男性
     */
    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    /**
     * 用户昵称 
     * @return user_nick 用户昵称 
     */
    public String getUserNick() {
        return userNick;
    }

    /**
     * 用户昵称 
     * @param userNick 用户昵称 
     */
    public void setUserNick(String userNick) {
        this.userNick = userNick == null ? null : userNick.trim();
    }

    /**
     * 用户头像
     * @return user_img 用户头像
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * 用户头像
     * @param userImg 用户头像
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    /**
     * 省
     * @return user_province 省
     */
    public String getUserProvince() {
        return userProvince;
    }

    /**
     * 省
     * @param userProvince 省
     */
    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince == null ? null : userProvince.trim();
    }

    /**
     * 市
     * @return user_city 市
     */
    public String getUserCity() {
        return userCity;
    }

    /**
     * 市
     * @param userCity 市
     */
    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    /**
     * 区
     * @return user_area 区
     */
    public String getUserArea() {
        return userArea;
    }

    /**
     * 区
     * @param userArea 区
     */
    public void setUserArea(String userArea) {
        this.userArea = userArea == null ? null : userArea.trim();
    }

    /**
     * 用户类型
     * @return user_type_id 用户类型
     */
    public Integer getUserTypeId() {
        return userTypeId;
    }

    /**
     * 用户类型
     * @param userTypeId 用户类型
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * 创建人ID
     * @return create_user_id 创建人ID
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建人ID
     * @param createUserId 创建人ID
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 更新人ID
     * @return update_user_id 更新人ID
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 更新人ID
     * @param updateUserId 更新人ID
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 生成时间
     * @return create_time 生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 生成时间
     * @param createTime 生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}