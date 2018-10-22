package com.cloud.user.pojo;

import java.util.Date;

public class User {
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 用户昵称（微信）
     */
    private String userNick;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户性别 1男  0女
     */
    private Integer userGender;

    /**
     * 用户生日
     */
    private Date userBirthday;

    /**
     * 用户星座
     */
    private String userConstellation;

    /**
     * 用户头像（默认获取微信头像可更改）
     */
    private String userHeadImg;

    /**
     * 用户手机
     */
    private String userMobile;

    /**
     * 用户常驻城市
     */
    private String userResidentCity;

    /**
     * 用户活动宣言
     */
    private String userDeclaration;

    /**
     * 用户微信号
     */
    private String userWx;

    /**
     * 用户注册时间
     */
    private Date userRegisterTime;

    /**
     * 用户更新时间
     */
    private Date userUpdateTime;

    /**
     * 是否为有效用户  1有效  0无效
     */
    private Integer isValid;

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
     * 用户类型
     * @return user_type 用户类型
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 用户类型
     * @param userType 用户类型
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 用户昵称（微信）
     * @return user_nick 用户昵称（微信）
     */
    public String getUserNick() {
        return userNick;
    }

    /**
     * 用户昵称（微信）
     * @param userNick 用户昵称（微信）
     */
    public void setUserNick(String userNick) {
        this.userNick = userNick == null ? null : userNick.trim();
    }

    /**
     * 用户姓名
     * @return user_name 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户姓名
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 用户性别 1男  0女
     * @return user_gender 用户性别 1男  0女
     */
    public Integer getUserGender() {
        return userGender;
    }

    /**
     * 用户性别 1男  0女
     * @param userGender 用户性别 1男  0女
     */
    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    /**
     * 用户生日
     * @return user_birthday 用户生日
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * 用户生日
     * @param userBirthday 用户生日
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * 用户星座
     * @return user_constellation 用户星座
     */
    public String getUserConstellation() {
        return userConstellation;
    }

    /**
     * 用户星座
     * @param userConstellation 用户星座
     */
    public void setUserConstellation(String userConstellation) {
        this.userConstellation = userConstellation == null ? null : userConstellation.trim();
    }

    /**
     * 用户头像（默认获取微信头像可更改）
     * @return user_head_img 用户头像（默认获取微信头像可更改）
     */
    public String getUserHeadImg() {
        return userHeadImg;
    }

    /**
     * 用户头像（默认获取微信头像可更改）
     * @param userHeadImg 用户头像（默认获取微信头像可更改）
     */
    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg == null ? null : userHeadImg.trim();
    }

    /**
     * 用户手机
     * @return user_mobile 用户手机
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 用户手机
     * @param userMobile 用户手机
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * 用户常驻城市
     * @return user_resident_city 用户常驻城市
     */
    public String getUserResidentCity() {
        return userResidentCity;
    }

    /**
     * 用户常驻城市
     * @param userResidentCity 用户常驻城市
     */
    public void setUserResidentCity(String userResidentCity) {
        this.userResidentCity = userResidentCity == null ? null : userResidentCity.trim();
    }

    /**
     * 用户活动宣言
     * @return user_declaration 用户活动宣言
     */
    public String getUserDeclaration() {
        return userDeclaration;
    }

    /**
     * 用户活动宣言
     * @param userDeclaration 用户活动宣言
     */
    public void setUserDeclaration(String userDeclaration) {
        this.userDeclaration = userDeclaration == null ? null : userDeclaration.trim();
    }

    /**
     * 用户微信号
     * @return user_wx 用户微信号
     */
    public String getUserWx() {
        return userWx;
    }

    /**
     * 用户微信号
     * @param userWx 用户微信号
     */
    public void setUserWx(String userWx) {
        this.userWx = userWx == null ? null : userWx.trim();
    }

    /**
     * 用户注册时间
     * @return user_register_time 用户注册时间
     */
    public Date getUserRegisterTime() {
        return userRegisterTime;
    }

    /**
     * 用户注册时间
     * @param userRegisterTime 用户注册时间
     */
    public void setUserRegisterTime(Date userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    /**
     * 用户更新时间
     * @return user_update_time 用户更新时间
     */
    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    /**
     * 用户更新时间
     * @param userUpdateTime 用户更新时间
     */
    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    /**
     * 是否为有效用户  1有效  0无效
     * @return is_valid 是否为有效用户  1有效  0无效
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * 是否为有效用户  1有效  0无效
     * @param isValid 是否为有效用户  1有效  0无效
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}