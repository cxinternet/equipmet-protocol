package cn.cxinternet.equipment.protocol.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TopicPlaceHolder {
    PRODUCT_KEY("${productKey}", "产品Key占位符"),
    DEVICE_KEY("${deviceKey}", "设备Key占位符");

    /**
     * 值
     */
    private final String value;

    /**
     * 描述
     */
    private final String description;
}
