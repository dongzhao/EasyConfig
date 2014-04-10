package dzhao.common.config.api;


import dzhao.common.config.api.domain.ConfigObject;

import java.util.Map;

public interface ConfigService {

    <T extends ConfigObject> T getConfig(Class<T> clazz);

    Map<String, Object> asMap();

}
