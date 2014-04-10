package dzhao.common.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dzhao.common.config.inject.ConfigModule;
import org.junit.After;
import org.junit.Before;

public abstract class AbstracTest {
    protected Injector injector;
    @Before
    public void setUp(){
        injector = Guice.createInjector(new ConfigModule());
    }

    @After
    public void tearDown(){

    }
}
