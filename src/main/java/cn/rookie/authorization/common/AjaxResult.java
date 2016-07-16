package cn.rookie.authorization.common;

import java.io.Serializable;

/**
 * Created by Rookie on 2016/7/16.
 * Package_name is cn.rookie.authorization.common.tree
 * Description:
 */
public class AjaxResult implements Serializable{

    public static final Integer AJAX_STATUS_CODE_SUCCESS = 0;
    public static final Integer AJAX_STATUS_CODE_WARN = 1;
    public static final Integer AJAX_STATUS_CODE_ERROR = 2;

    private static final long serialVersionUID = 2989303732410683073L;

    private Integer statusCode;
    private String message;
    public AjaxResult() {
        super();
    }

    public static AjaxResult success() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setStatusCode(AJAX_STATUS_CODE_SUCCESS);
        ajaxResult.setMessage("操作成功");
        return ajaxResult;
    }

    public static AjaxResult error() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setStatusCode(AJAX_STATUS_CODE_ERROR);
        return ajaxResult;
    }
    public static AjaxResult warn() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setStatusCode(AJAX_STATUS_CODE_WARN);
        return ajaxResult;
    }

    public AjaxResult(Integer statusCode, String message) {
        super();
        this.statusCode = statusCode;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
