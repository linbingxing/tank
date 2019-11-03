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
 * 系统用户
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
@ApiModel(value="SysUser对象", description="系统用户")
public class SysUser extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "登录用户名")
    @TableField("loginName")
    private String loginName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "真实名称")
    @TableField("realName")
    private String realName;

    @ApiModelProperty(value = "手机")
    private String mobile;

    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "头像")
    private String photo;

    @ApiModelProperty(value = "用户状态（0 冻结、1 激活 ）")
    private Boolean status;

    @ApiModelProperty(value = "部门id")
    @TableField("deptId")
    private Long deptId;

    @ApiModelProperty(value = "职位id")
    @TableField("jobId")
    private Long jobId;

    @ApiModelProperty(value = "备注信息")
    private String remark;


}
