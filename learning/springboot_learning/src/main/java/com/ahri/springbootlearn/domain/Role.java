package com.ahri.springbootlearn.domain;

import java.util.Date;

public class Role {
    // 姓名（中文）
    private String nameZh;
    // 姓名（英文）
    private String nameEn;
    // 生日
    private Date birthday;
    // 称号
    private String title;
    // 上线版本
    private String version;
    // 命之座
    private String constellation;
    // 星级
    private int level;

    public Role() {
    }

    public Role(String nameZh, String nameEn, Date birthday, String title, String version, String constellation,
                int level) {
        super();
        this.nameZh = nameZh;
        this.nameEn = nameEn;
        this.birthday = birthday;
        this.title = title;
        this.version = version;
        this.constellation = constellation;
        this.level = level;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
