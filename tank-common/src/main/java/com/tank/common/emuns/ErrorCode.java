package com.tank.common.emuns;

/**
  * @description 返回码
  * @author lbx
  * @date 2019/4/15 14:21
  * @version 1.0.0
 **/
public enum ErrorCode {

    SUCCESS(0, "success", "成功"),
    ELSE(1000, "other reason", "其他原因"),
    ILLEGAL_PARAM(1001, "illegal paramer", "参数错误"),
    PARAM_ABSENT(1002, "necessary paramer absent", "必填参数为空"),
    DB_EXCEPTION(1003, "database exception", "数据库异常"),
    EXCEPTION(1004, "system exception", "系统异常"),
    NOT_FIND(1005, "object is null", "对象为空"),
    ILLEGAL_ARGUMENT(1006,"Illegal  Argument","参数解析失败"),
    NOT_SUPPORT_METHOD(1007,"not support method","不支持当前请求方法"),
    NOT_PERMISSION(1008,"not permission","没有权限请求"),
    OBJECT_EXIST(1009, "object is exist", "对象已存在");

    private int		code;

    private String	message;

    private String	cnMessage;

    ErrorCode(int code, String message, String cnMessage) {
        this.code = code;
        this.message = message;
        this.cnMessage = cnMessage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCnMessage() {
        return cnMessage;
    }

    public void setCnMessage(String cnMessage) {
        this.cnMessage = cnMessage;
    }


    public static ErrorCode getErrorCodeByCode(Integer code) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (code.equals(errorCode.getCode())) {
                return errorCode;
            }
        }
        return null;
    }
}
