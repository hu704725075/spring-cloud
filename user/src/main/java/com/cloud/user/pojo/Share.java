package com.cloud.user.pojo;

import java.util.Date;

public class Share {
    /**
     * 分享id
     */
    private Integer shareId;

    /**
     * 分享类型id
     */
    private Integer shareTypeId;

    /**
     * 分享链接
     */
    private String shareUrl;

    /**
     * 分享token
     */
    private String shareToken;

    /**
     * 分享参数
     */
    private String shareSetting;

    /**
     * 分享来源
     */
    private String shareBusiSource;

    /**
     * 分享来源号
     */
    private String shareBusiCode;

    /**
     * 访问人数
     */
    private Integer shareAccessCount;

    /**
     * 接受人数
     */
    private Integer shareAcceptCount;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建人
     */
    private Integer createUser;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 修改人
     */
    private Integer updateUser;

    /**
     * 分享id
     * @return share_id 分享id
     */
    public Integer getShareId() {
        return shareId;
    }

    /**
     * 分享id
     * @param shareId 分享id
     */
    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    /**
     * 分享类型id
     * @return share_type_id 分享类型id
     */
    public Integer getShareTypeId() {
        return shareTypeId;
    }

    /**
     * 分享类型id
     * @param shareTypeId 分享类型id
     */
    public void setShareTypeId(Integer shareTypeId) {
        this.shareTypeId = shareTypeId;
    }

    /**
     * 分享链接
     * @return share_url 分享链接
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * 分享链接
     * @param shareUrl 分享链接
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl == null ? null : shareUrl.trim();
    }

    /**
     * 分享token
     * @return share_token 分享token
     */
    public String getShareToken() {
        return shareToken;
    }

    /**
     * 分享token
     * @param shareToken 分享token
     */
    public void setShareToken(String shareToken) {
        this.shareToken = shareToken == null ? null : shareToken.trim();
    }

    /**
     * 分享参数
     * @return share_setting 分享参数
     */
    public String getShareSetting() {
        return shareSetting;
    }

    /**
     * 分享参数
     * @param shareSetting 分享参数
     */
    public void setShareSetting(String shareSetting) {
        this.shareSetting = shareSetting == null ? null : shareSetting.trim();
    }

    /**
     * 分享来源
     * @return share_busi_source 分享来源
     */
    public String getShareBusiSource() {
        return shareBusiSource;
    }

    /**
     * 分享来源
     * @param shareBusiSource 分享来源
     */
    public void setShareBusiSource(String shareBusiSource) {
        this.shareBusiSource = shareBusiSource == null ? null : shareBusiSource.trim();
    }

    /**
     * 分享来源号
     * @return share_busi_code 分享来源号
     */
    public String getShareBusiCode() {
        return shareBusiCode;
    }

    /**
     * 分享来源号
     * @param shareBusiCode 分享来源号
     */
    public void setShareBusiCode(String shareBusiCode) {
        this.shareBusiCode = shareBusiCode == null ? null : shareBusiCode.trim();
    }

    /**
     * 访问人数
     * @return share_access_count 访问人数
     */
    public Integer getShareAccessCount() {
        return shareAccessCount;
    }

    /**
     * 访问人数
     * @param shareAccessCount 访问人数
     */
    public void setShareAccessCount(Integer shareAccessCount) {
        this.shareAccessCount = shareAccessCount;
    }

    /**
     * 接受人数
     * @return share_accept_count 接受人数
     */
    public Integer getShareAcceptCount() {
        return shareAcceptCount;
    }

    /**
     * 接受人数
     * @param shareAcceptCount 接受人数
     */
    public void setShareAcceptCount(Integer shareAcceptCount) {
        this.shareAcceptCount = shareAcceptCount;
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建人
     * @return create_user 创建人
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     * @param createUser 创建人
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * 修改时间
     * @return update_date 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 修改时间
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 修改人
     * @return update_user 修改人
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * 修改人
     * @param updateUser 修改人
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}