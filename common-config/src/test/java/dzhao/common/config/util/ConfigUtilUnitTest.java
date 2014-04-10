package dzhao.common.config.util;

import junit.framework.Assert;
import org.junit.Test;

public class ConfigUtilUnitTest {

    @Test
    public void testCanSeperateWordsByGivenSplitCharacter(){
        String testWords = "ConfigNewValue";
        String testSplitChar = ".";
        Assert.assertEquals("config.new.value", ConfigUtil.format(testWords, testSplitChar));
    }

}
