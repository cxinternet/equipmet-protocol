package cn.cxinternet.equipment.protocol.dto;

import lombok.Data;

@Data
public class InfluxServe {
    /**
     * 服务编码
     */
    private String attrCode;

    /**
     * 服务数据
     */
    private String serveData;

    /**
     * 上报时间
     */
    private Long time;
}
