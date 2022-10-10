package cn.cxinternet.equipment.protocol.dto;

import lombok.Data;

@Data
public class SecretDTO {
    private String productKey;

    private String productSecret;

    private String deviceKey;

    private String deviceSecret;
}
