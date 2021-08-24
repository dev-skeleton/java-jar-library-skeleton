package com.example.artifact.modulename;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ExampleUtilTest {

    private static final String HEX_STR = "ACED0005737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C770800000010000000017400056E616D653174000676616C75653178";
    private static final String NAME = "name1";
    private static final String VALUE = "value1";

    @Test
    public void testSerialize() {
        Map<String, String> map = new HashMap<>();
        map.put(NAME, VALUE);
        byte[] bytes = ExampleUtil.serialize(map);
        String hex = ExampleUtil.bytesToHex(bytes);
        assertEquals(HEX_STR, hex);
        System.out.println("PASS: testSerialize");
    }

    @Test
    public void testDeserialize() {
        byte[] bytes = ExampleUtil.hexStringToBytes(HEX_STR);
        Object obj = ExampleUtil.deserialize(bytes);
        if (obj instanceof Map){
            String val = (String) ((Map<?, ?>) obj).get(NAME);
            assertEquals(VALUE, val);
            System.out.println("PASS: testDeserialize");
        } else {
            assertEquals(true, false);
            System.out.println("FAIL: testDeserialize");
        }
    }


}
