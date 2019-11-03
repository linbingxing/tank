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
 * 系统资源
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
@ApiModel(value="SysResource对象", description="系统资源")
public class SysResource extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "模块菜单id")
    @TableField("menuId")
    private Long menuId;

    @ApiModelProperty(value = "资源名称")
    @TableField("resourceName")
    private String resourceName;

    @ApiModelProperty(value = "资源编号")
    @TableField("resourceCode")
    private String resourceCode;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "权限标识")
    private String permission;

    @ApiModelProperty(value = "是否展示（0 不展示、1 展示 ）")
    private Boolean status;

    @ApiModelProperty(value = "系统标识（1、坦克后台 2、其他(后续补充））")
    @TableField("sysId")
    private Boolean sysId;

    @ApiModelProperty(value = "备注信息")
    private String remark;


}
