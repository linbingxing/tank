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
 * 系统用户-角色
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
@ApiModel(value="SysUserRole对象", description="系统用户-角色")
public class SysUserRole extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    @TableField("userId")
    private Long userId;

    @ApiModelProperty(value = "模块角色id")
    @TableField("roleId")
    private Long roleId;


}
