package cn.rookie.authorization.entity;

import cn.rookie.authorization.common.BaseEntity;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.entity
 * Description:
 */
public class RoleFunction extends BaseEntity{

    private Long roleId;
    private Long functionId;
    private Integer status;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoleFunction{" +
                "roleId=" + roleId +
                ", functionId=" + functionId +
                ", status=" + status +
                '}';
    }
}
