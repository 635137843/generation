package com.hmx.generation.test.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 解析省份表
 * </p>
 *
 * @author hemingxin
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="WsAnalysisProvinces对象", description="解析省份表")
public class WsAnalysisProvinces implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域编码")
    private String regCode;

    @ApiModelProperty(value = "区域名称")
    private String regName;

    @ApiModelProperty(value = "区域等级，1-省和地市，2-区县")
    private Integer level;


}
