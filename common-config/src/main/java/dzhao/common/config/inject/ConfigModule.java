package dzhao.common.config.inject;


import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import dzhao.common.config.api.ConfigReader;
import dzhao.common.config.api.ConfigService;
import dzhao.common.config.reader.PropertiesConfigReader;
import dzhao.common.config.service.ConfigServiceImpl;

public class ConfigModule extends AbstractModule{
    @Override
    protected void configure() {
        bind(ConfigService.class).to(ConfigServiceImpl.class).in(Singleton.class);
        bind(ConfigReader.class).to(PropertiesConfigReader.class).in(Singleton.class);
    }
}
