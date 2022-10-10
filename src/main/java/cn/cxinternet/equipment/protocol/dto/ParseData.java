package cn.cxinternet.equipment.protocol.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class ParseData {
    private Date time;

    private String enterpriseId;

    private String deviceId;

    private String deviceName;

    private String deviceKey;

    private String productId;

    private String productName;

    private String productKey;

    private String protocolId;

    private String dataSourceId;

    private List<InfluxAttr> attr;

    private List<InfluxEvent> event;

    private List<InfluxServe> serve;

    private Map<String, String> tags;

    private Map<String, Object> fields;
}
