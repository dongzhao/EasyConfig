package dzhao.common.config.reader;

import com.google.inject.Inject;
import dzhao.common.config.api.ConfigReader;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class PropertiesConfigReader implements ConfigReader{

    private PropertiesConfiguration configuration;

    @Inject
    public PropertiesConfigReader() throws ConfigurationException, MalformedURLException {
        URL url = PropertiesConfigReader.class.getClassLoader().getResource("configuration.properties");
        configuration = new PropertiesConfiguration(url);
    }

    @Override
    public Object getValue(String key, Field field) {
        synchronized (configuration) {
            if (int.class.isAssignableFrom(field.getType())) {
                return configuration.getInt(key);
            } else if (boolean.class.isAssignableFrom(field.getType())) {
                return configuration.getBoolean(key);
            } else if (long.class.isAssignableFrom(field.getType())) {
                return configuration.getLong(key);
            } else if (short.class.isAssignableFrom(field.getType())) {
                return configuration.getShort(key);
            } else if (byte.class.isAssignableFrom(field.getType())) {
                return configuration.getByte(key);
            } else if (float.class.isAssignableFrom(field.getType())) {
                return configuration.getFloat(key);
            } else if (double.class.isAssignableFrom(field.getType())) {
                return configuration.getDouble(key);
            } else if (char.class.isAssignableFrom(field.getType())) {
                return configuration.getString(key).toCharArray()[0];
            } else if (String[].class.isAssignableFrom(field.getType())) {
                return configuration.getStringArray(key);
            } else if (String.class.isAssignableFrom(field.getType())) {
                return configuration.getString(key, null);
            } else if (Integer.class.isAssignableFrom(field.getType())) {
                return configuration.getInteger(key, Integer.valueOf(DEFAULT_INT));
            } else if (Long.class.isAssignableFrom(field.getType())) {
                return configuration.getLong(key, Long.valueOf(DEFAULT_LONG));
            } else if (Double.class.isAssignableFrom(field.getType())) {
                return configuration.getDouble(key, Double.valueOf(DEFAULT_DOUBLE));
            } else if (Float.class.isAssignableFrom(field.getType())) {
                return configuration.getFloat(key, Float.valueOf(DEFAULT_FLOAT));
            } else if (Boolean.class.isAssignableFrom(field.getType())) {
                return configuration.getBoolean(key, Boolean.valueOf(null));
            } else if (Byte.class.isAssignableFrom(field.getType())) {
                return configuration.getByte(key, Byte.valueOf(DEFAULT_BYTE));
            } else if (Short.class.isAssignableFrom(field.getType())) {
                return configuration.getShort(key, Short.valueOf(DEFAULT_SHORT));
            } else if (List.class.isAssignableFrom(field.getType())) {
                return configuration.getList(key, null);
            } else {
                throw new UnsupportedOperationException("not supported the value type");
            }
        }
    }
}
