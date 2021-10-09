package com.bluestar.demo.common.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Joe Liu
 * @date 2021年10月9日
 */
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private Date birthday;
    private Date createdate;
    private Integer creatoraccountid;
    private Date modifydate;
    private Integer modifieraccountid;
    private Boolean enable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getCreatoraccountid() {
        return creatoraccountid;
    }

    public void setCreatoraccountid(Integer creatoraccountid) {
        this.creatoraccountid = creatoraccountid;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getModifieraccountid() {
        return modifieraccountid;
    }

    public void setModifieraccountid(Integer modifieraccountid) {
        this.modifieraccountid = modifieraccountid;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

}
