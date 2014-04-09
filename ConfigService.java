package my.lab.config.api;

import my.lab.config.api.domain.Config;

import java.util.Map;

public interface ConfigService {
    <T extends Config> T getConfig(Class<T> configClazz) throws IllegalAccessException, InstantiationException;
    Map<String, String> toMap();

}
