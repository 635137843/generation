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
 * 重要安全事件表
 * </p>
 *
 * @author hmx
 * @since 2020-10-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ImportantSecurityIncident对象", description="重要安全事件表")
public class ImportantSecurityIncident implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键自增")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "事件标题")
    private String eventTitle;

    @ApiModelProperty(value = "事件描述")
    private String eventDesc;

    @ApiModelProperty(value = "事件发现方式")
    private String eventDiscoveryMethod;

    @ApiModelProperty(value = "事件涉及系统资产信息及业务系统定级级别")
    private String eventSystemRatingLevel;

    @ApiModelProperty(value = "通信受影响程度及具体情况")
    private String communicationImpact;

    @ApiModelProperty(value = "事件处理情况")
    private String incidentHandling;

    @ApiModelProperty(value = "事件原因及后续措施")
    private String eventCause;

    @ApiModelProperty(value = "操作时间")
    private Date opDate;


}
