package cn.rookie.authorization.common.tree;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.common.tree
 * Description:
 */
public class NodeAttribute {

    private String url;
    private Long id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NodeAttribute(String url, Long id) {
        this.url = url;
        this.id = id;
    }
}
