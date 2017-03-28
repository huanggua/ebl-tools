package com.wangyin.ebl.po.user;

import java.util.Date;

public class LicenseUserSecurity {
    private Integer id;

    private String userId;

    private String password;

    private String salt;

    private String securityQuestion;

    private Byte caFlag;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;
    
    private LicenseUserLogin licenseUserLogin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion == null ? null : securityQuestion.trim();
    }

    public Byte getCaFlag() {
        return caFlag;
    }

    public void setCaFlag(Byte caFlag) {
        this.caFlag = caFlag;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created == null ? null : created.trim();
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified == null ? null : modified.trim();
    }
    
    public LicenseUserLogin getLicenseUserLogin() {
    	return licenseUserLogin;
    }
    
    public void setLicenseUserLogin(LicenseUserLogin licenseUserLogin1) {
    	this.licenseUserLogin = licenseUserLogin1;
    }
}