package com.tank.user.entity;

import com.tank.common.model.SuperEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统日志
 * </p>
 *
 * @author lbx
 * @since 2019-11-03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
 @EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="SysLog对象", description="系统日志")
public class SysLog extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户登录名")
    @TableField("loginName")
    private String loginName;

    @ApiModelProperty(value = "日志来源类型")
    @TableField("loginType")
    private String loginType;

    @ApiModelProperty(value = "模块名称")
    private String module;

    @ApiModelProperty(value = "全类名或者操作url")
    private String method;

    @ApiModelProperty(value = "请求ip")
    @TableField("requestIp")
    private String requestIp;

    @ApiModelProperty(value = "请求参数")
    private String params;

    @ApiModelProperty(value = "信息")
    private String msg;

    @ApiModelProperty(value = "请求时间")
    @TableField("useTime")
    private Long useTime;

    @ApiModelProperty(value = "备注信息")
    private String remark;


}
