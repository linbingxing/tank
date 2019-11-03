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
 * 系统角色
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
@ApiModel(value="SysRole对象", description="系统角色")
public class SysRole extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色名称")
    @TableField("roleName")
    private String roleName;

    @ApiModelProperty(value = "角色英文名称，代码")
    @TableField("roleCode")
    private String roleCode;

    @ApiModelProperty(value = "角色状态（0 冻结、1 激活 ）")
    private Boolean status;

    @ApiModelProperty(value = "系统标识（1、坦克后台 2、其他(后续补充））")
    @TableField("sysId")
    private Boolean sysId;

    @ApiModelProperty(value = "数据范围")
    @TableField("dataScope")
    private String dataScope;

    @ApiModelProperty(value = "备注信息")
    private String remark;


}
