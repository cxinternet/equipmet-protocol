package cn.cxinternet.equipment.protocol.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Topic {
    /**
     * 功能
     */
    private String type;

    /**
     * topic类名
     */
    private String name;

    /**
     * 权限 100 订阅 200 发布 300 订阅和发布
     */
    private Integer permission;

    /**
     * 描述
     */
    private String remark;
}
