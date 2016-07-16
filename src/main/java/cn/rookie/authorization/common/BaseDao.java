package cn.rookie.authorization.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.common.tree
 * Description:
 */
public abstract class BaseDao {

    @Autowired
    protected JdbcTemplate jdbcTemplate;

}
