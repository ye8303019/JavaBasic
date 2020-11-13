package com.chris.serializable_test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by ye830 on 10/15/2018.
 */
public class JacksonSerializationTest {
    public static void main(String[] args) throws IOException {

        JacksonNestExampleEntity jacksonNestExampleEntity = new JacksonNestExampleEntity("male");

        JacksonExampleEntity jacksonExampleEntity = new JacksonExampleEntity("Chris", 30, jacksonNestExampleEntity);

        ObjectMapper objectMapper = new ObjectMapper();

        byte[] byteObj = objectMapper.writeValueAsBytes(jacksonExampleEntity);

        JacksonExampleEntity jacksonExampleEntityDes = objectMapper.readValue(byteObj, JacksonExampleEntity.class);

        System.out.println(jacksonExampleEntityDes);

    }
}
