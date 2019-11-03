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
 * 系统公司信息
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
@ApiModel(value="SysCompany对象", description="系统公司信息")
public class SysCompany extends SuperEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "公司名称")
    private String name;

    @ApiModelProperty(value = "公司地址")
    private String address;

    @ApiModelProperty(value = "区域id")
    @TableField("areaId")
    private String areaId;

    @ApiModelProperty(value = "邮政编码")
    @TableField("zipCode")
    private String zipCode;

    @ApiModelProperty(value = "法人")
    private String master;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "传真")
    private String fax;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "版权信息")
    private String copyright;

    @ApiModelProperty(value = "备注信息")
    private String remark;


}
