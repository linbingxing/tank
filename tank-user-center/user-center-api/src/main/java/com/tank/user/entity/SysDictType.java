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
 * 字典类型表
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
@ApiModel(value="SysDictType对象", description="字典类型表")
public class SysDictType extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "字典类型编码")
    private String code;

    @ApiModelProperty(value = "字典类型名称")
    private String name;

    @ApiModelProperty(value = "字典描述")
    private String description;

    @ApiModelProperty(value = "是否是系统字典，0、否 1、是")
    @TableField("sysFlag")
    private Boolean sysFlag;

    @ApiModelProperty(value = "状态（0 冻结、1 激活 ）")
    private Boolean status;

    @ApiModelProperty(value = "排序")
    private Integer sort;


}
