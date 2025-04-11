package com.monster.security.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * @author LiuZhaoHong
 * @date 2025/4/6
 */
@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder
                .dateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"))
                .timeZone(TimeZone.getTimeZone("GMT+8"))
                .build();

        SimpleModule module = new SimpleModule();
        module.addSerializer(Long.class, new ToStringSerializer());
        module.addSerializer(Long.TYPE, new ToStringSerializer());
        objectMapper.registerModule(module);

        return objectMapper;
    }


}
