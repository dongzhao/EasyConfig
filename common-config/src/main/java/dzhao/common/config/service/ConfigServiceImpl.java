package dzhao.common.config.service;


import com.google.inject.Inject;
import dzhao.common.config.api.ConfigReader;
import dzhao.common.config.api.ConfigService;
import dzhao.common.config.api.annotation.ConfigFieldInfo;
import dzhao.common.config.api.annotation.ConfigInfo;
import dzhao.common.config.api.domain.ConfigObject;
import dzhao.common.config.util.ConfigUtil;

import java.lang.reflect.Field;
import java.util.Map;

public class ConfigServiceImpl implements ConfigService{

    private final ConfigReader reader;

    private static String DOT = ".";

    @Inject
    public ConfigServiceImpl(ConfigReader reader){
        this.reader = reader;
    }


    @Override
    public <T extends ConfigObject> T getConfig(Class<T> clazz){
        T configuration = null;
        try {
            configuration = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        ConfigInfo info = clazz.getAnnotation(ConfigInfo.class);

        StringBuilder configKeyPrefix = new StringBuilder();

        String prefix = info.prefix().trim();
        if(prefix.isEmpty()){
            prefix = ConfigUtil.format(clazz.getSimpleName(), DOT);
        }
        configKeyPrefix.append(prefix + DOT);

        for(Field field : clazz.getDeclaredFields())  {
            ConfigFieldInfo fieldInfo = field.getAnnotation(ConfigFieldInfo.class);
            String fieldName = fieldInfo.prefix().trim();
            if(fieldName.isEmpty()){
                fieldName = ConfigUtil.format(field.getName(), DOT) ;
            }
            field.setAccessible(true);
            Object objValue = reader.getValue(configKeyPrefix.toString() + fieldName, field);
            try {
                field.set(configuration, objValue);
            } catch (IllegalAccessException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            field.setAccessible(false);
        }
        return configuration;
    }

    @Override
    public Map<String, Object> asMap() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
