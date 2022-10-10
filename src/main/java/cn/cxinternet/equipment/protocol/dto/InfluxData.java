package cn.cxinternet.equipment.protocol.dto;

import lombok.Data;

import java.util.List;

@Data
public class InfluxData {
    private String productId;

    private String deviceId;

    private String productName;

    private String deviceName;

    private String productKey;

    private String deviceKey;

    private List<InfluxAttr> attr;

    private List<InfluxEvent> event;

    private List<InfluxServe> serve;
}
