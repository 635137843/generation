package com.hmx.generation.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 性能问题工单业务信息表
 * </p>
 *
 * @author hmx
 * @since 2020-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WsPerformanceInfo对象", description="性能问题工单业务信息表")
public class WsPerformanceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "工单号")
    private String wsid;

    @ApiModelProperty(value = "问题级别编码")
    private String problemLevelCode;

    @ApiModelProperty(value = "问题对象类别名称")
    private String problemObjectCategoryName;

    @ApiModelProperty(value = "问题对象类别编码")
    private String problemObjectCategoryCode;

    @ApiModelProperty(value = "问题对象名称")
    private String problemObjectName;

    @ApiModelProperty(value = "问题省份名称")
    private String problemProvinceName;

    @ApiModelProperty(value = "问题省份编号")
    private String problemProvinceCode;

    @ApiModelProperty(value = "问题地市名称")
    private String problemCityName;

    @ApiModelProperty(value = "问题地市编号")
    private String problemCityCode;

    @ApiModelProperty(value = "业务类别名称")
    private String businessCategoryName;

    @ApiModelProperty(value = "业务类别编号")
    private String businessCategoryCode;

    @ApiModelProperty(value = "应用名称")
    private String applicationName;

    @ApiModelProperty(value = "应用名称编号")
    private String applicationNameCode;

    @ApiModelProperty(value = "问题类别（默认“性能劣化”）")
    private String problemType;

    @ApiModelProperty(value = "问题指标数（默认“1”）")
    private String problemIndexNumber;

    @ApiModelProperty(value = "发生时间")
    private Date happenTime;

    @ApiModelProperty(value = "问题处理时限")
    private Date problemHandleLimit;

    @ApiModelProperty(value = "问题描述")
    private String problemDescription;

    @ApiModelProperty(value = "处理说明")
    private String processingInstructions;

    @ApiModelProperty(value = "派发给")
    private String distributeObject;

    @ApiModelProperty(value = "修改时间")
    private Date opTime;

    @ApiModelProperty(value = "问题类别名称")
    private String problemLevelName;

    private String pmId;

    private String serCaller;


}
