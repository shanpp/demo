package com.liguo.demo.core.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 资金计划业务控制表
 * </p>
 *
 * @author liguo
 * @since 2020-09-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TParamConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数键
     */
    private String paramKey;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 数据库表
     */
    private String paramDesc;

    /**
     * 租户id
     */
    private Long lesseeId;

    /**
     * 创建时间 yyyy-MM-dd hh:mm:ss
     */
    private LocalDateTime createTime;

    /**
     * 修改时间 yyyy-MM-dd hh:mm:ss
     */
    private LocalDateTime updateTime;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 修改人
     */
    private String modifiedBy;

    /**
     * 删除标识 1:删除 0：未删除
     */
    private Integer delFlag;

    /**
     * 备注
     */
    private String remark;


}
