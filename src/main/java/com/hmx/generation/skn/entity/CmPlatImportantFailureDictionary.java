package com.hmx.generation.skn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2020-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CmPlatImportantFailureDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer ordernum;

    private String incidentsn;

    private String incidentname;

    private String incidentsort;

    private String incidentitem;

    private String incidentdefine;


}
