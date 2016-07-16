package cn.rookie.authorization.common;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.common.tree
 * Description:
 */
public enum Whether {

    YES(1),
    NO(0);

    private int value;

    Whether(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
