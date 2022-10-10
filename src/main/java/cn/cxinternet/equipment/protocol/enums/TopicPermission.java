/**
 * Project Name: cloud-server
 * File Name: ProductStatus
 * Package Name: cn.cxinternet.cloud.server.equipment.product.enums
 * Date: 2022/9/7 15:18
 * Author: 方瑞冬
 * Copyright (c) 2022, huafon Chuangxiang Co., Ltd. All Rights Reserved.
 */
package cn.cxinternet.equipment.protocol.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 方瑞冬
 */
@Getter
@AllArgsConstructor
public enum TopicPermission {
    SUBSCRIPTION(100, "订阅"),
    PUBLISH(200, "发布"),
    PUBLISH_SUBSCRIPTION(300, "发布和订阅");

    /**
     * 值
     */
    private final Integer value;

    /**
     * 描述
     */
    private final String description;
}
