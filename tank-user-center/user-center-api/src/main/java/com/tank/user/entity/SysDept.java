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
 * 系统部门
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
@ApiModel(value="SysDept对象", description="系统部门")
public class SysDept extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部门名称")
    @TableField("deptName")
    private String deptName;

    @ApiModelProperty(value = "部门编码")
    @TableField("deptCode")
    private String deptCode;

    @ApiModelProperty(value = "父id")
    @TableField("parentId")
    private Long parentId;

    @ApiModelProperty(value = "所在公司id")
    @TableField("companyId")
    private Long companyId;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "部门状态（0 冻结、1 激活 ）")
    private Boolean status;

    @ApiModelProperty(value = "系统标识（1、坦克后台 2、其他(后续补充））")
    @TableField("sysId")
    private Boolean sysId;

    @ApiModelProperty(value = "备注信息")
    private String remark;


}
