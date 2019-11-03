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
 * 系统角色-菜单
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
@ApiModel(value="SysRoleMenu对象", description="系统角色-菜单")
public class SysRoleMenu extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "模块角色id")
    @TableField("roleId")
    private Long roleId;

    @ApiModelProperty(value = "模块菜单id")
    @TableField("menuId")
    private Long menuId;


}
