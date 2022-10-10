package cn.cxinternet.equipment.protocol.api;

import cn.cxinternet.equipment.protocol.dto.ParseData;
import cn.cxinternet.equipment.protocol.dto.SecretDTO;
import cn.cxinternet.equipment.protocol.dto.Topic;

import java.util.List;

public interface ProtocolApiProvider {
    List<Topic> topics();

    ParseData parseData(ParseData parseData, String topic, String dataJson);

    SecretDTO getSecret(String dataJson);
}
