package cn.rookie.authorization.entity;

import cn.rookie.authorization.common.BaseEntity;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.entity
 * Description:
 */
public class User extends BaseEntity{

    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
