package com.hmx.generation.cd.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 割接信息表
 * </p>
 *
 * @author hmx
 * @since 2020-10-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CutoverInformation对象", description="割接信息表")
public class CutoverInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键自增")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "割接类型")
    private String cutoverType;

    @ApiModelProperty(value = "网元名称")
    private String networkElementName;

    @ApiModelProperty(value = "割接开始时间")
    private Date cutoverStartTime;

    @ApiModelProperty(value = "割接结束时间")
    private Date cutoverEndTime;

    @ApiModelProperty(value = "影响情况")
    private String impactSituation;

    @ApiModelProperty(value = "是否影响集客业务")
    private String isAffectInboundBusiness;

    @ApiModelProperty(value = "影响的集客名称及电路代号")
    private String affectedCustomerNameCircuitCode;

    @ApiModelProperty(value = "操作时间")
    private Date opDate;


}
