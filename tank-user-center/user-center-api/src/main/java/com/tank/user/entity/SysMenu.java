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
 * 系统菜单
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
@ApiModel(value="SysMenu对象", description="系统菜单")
public class SysMenu extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "父级菜单id")
    @TableField("parentId")
    private Long parentId;

    @ApiModelProperty(value = "菜单名称")
    @TableField("menuName")
    private String menuName;

    @ApiModelProperty(value = "菜单编号")
    @TableField("menuCode")
    private String menuCode;

    @ApiModelProperty(value = "菜单层级路径")
    private String path;

    @ApiModelProperty(value = "链接地址")
    private String href;

    @ApiModelProperty(value = "菜单级别")
    @TableField("menuLevel")
    private Integer menuLevel;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "是否为公共模块（任务角色都能拥有的权限）")
    @TableField("isPublic")
    private Integer isPublic;

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
