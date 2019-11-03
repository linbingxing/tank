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
 * 系统职务
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
@ApiModel(value="SysJob对象", description="系统职务")
public class SysJob extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "职务名称")
    @TableField("jobName")
    private String jobName;

    @ApiModelProperty(value = "所属部门ID")
    @TableField("deptId")
    private Long deptId;

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
