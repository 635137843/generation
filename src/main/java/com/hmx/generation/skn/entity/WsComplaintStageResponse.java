package com.hmx.generation.skn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author sunkening
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WsComplaintStageResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String wsid;

    /**
     * 已定位故障原因  0：否    1：是
     */
    private Integer isGetFailReason;

    /**
     * 故障分类
     */
    private String complaintType;

    /**
     * 问题原因
     */
    private String problemReason;

    /**
     * 联系人
     */
    private String linkMan;

    /**
     * 联系人电话
     */
    private String linkManPhone;

    /**
     * 业务是否已回复  0：否   1：是
     */
    private Integer isRecover;

    /**
     * 业务恢复时间
     */
    private Date recoverTime;

    /**
     * 操作人id
     */
    private String handleUserId;

    /**
     * 操作人名称
     */
    private String handleUserName;


}
