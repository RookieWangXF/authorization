package cn.rookie.authorization.entity;

import cn.rookie.authorization.common.BaseEntity;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.entity
 * Description:
 */
public class UserRole extends BaseEntity{

    private Long userId;
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
