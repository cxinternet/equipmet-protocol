package cn.cxinternet.equipment.protocol.dto;

import lombok.Data;

@Data
public class InfluxEvent {
    /**
     * 事件编码
     */
    private String attrCode;

    /**
     * 事件数据
     */
    private String eventData;

    /**
     * 上报时间
     */
    private Long time;
}
