package cn.rookie.authorization.entity;

import cn.rookie.authorization.common.BaseEntity;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.entity
 * Description:
 */
public class Function extends BaseEntity{

    private String name;
    private Long parentId;
    private String url;
    private Integer serialNum;
    private Integer accordion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Integer getAccordion() {
        return accordion;
    }

    public void setAccordion(Integer accordion) {
        this.accordion = accordion;
    }

    @Override
    public String toString() {
        return "Function{" +
                "name='" + name + '\'' +
                ", parentId=" + parentId +
                ", url='" + url + '\'' +
                ", serialNum=" + serialNum +
                ", accordion=" + accordion +
                '}';
    }
}
