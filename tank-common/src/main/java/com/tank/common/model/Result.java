package com.tank.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tank.common.emuns.ErrorCode;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
  * @description 请求响应体
  * @author lbx
  * @date 2019/11/3 10:55
  * @version 1.0.0
 **/
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "数据", example = "0")
    private T data;

    @ApiModelProperty(value = "返回码", example = "0")
    private Integer	 code;

    @ApiModelProperty(value = "返回描述", example = "illegal param")
    private String	 message;

    @JsonIgnore
    private ErrorCode errorCode;

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    private Result<T> code(int code) {
        this.setCode(code);
        return this;
    }

    private Result<T> message(String message) {
        this.setMessage(message);
        return this;
    }

    public Result<T> data(T result) {
        this.setData(result);
        return this;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
