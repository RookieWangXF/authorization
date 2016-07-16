package cn.rookie.authorization.entity;

import cn.rookie.authorization.common.BaseEntity;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.entity
 * Description:
 */
public class Role extends BaseEntity{

    private String name;
    private String functionIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunctionIds() {
        return functionIds;
    }

    public void setFunctionIds(String functionIds) {
        this.functionIds = functionIds;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", functionIds='" + functionIds + '\'' +
                '}';
    }
}
