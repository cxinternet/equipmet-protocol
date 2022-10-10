package cn.cxinternet.equipment.protocol.dto;

import lombok.Data;

@Data
public class InfluxAttr {
    /**
     * 属性编码
     */
    private String attrCode;

    /**
     * 属性数据
     */
    private String attrData;

    /**
     * 上报时间
     */
    private Long time;
}
