package dzhao.common.config.util;

import org.apache.commons.lang.StringUtils;

public class ConfigUtil {

    private ConfigUtil(){}

    public static String format(String value, String split){
        StringBuilder output = new StringBuilder();
        String[] tokens = StringUtils.splitByCharacterTypeCamelCase(value);
        for(String token : tokens){
            if(output.length() > 0){
                output.append(split);
            }
            output.append(token.toLowerCase().trim());
        }
        return output.toString();
    }
}
