package com.codewr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.codewr.core.SchedulerBo;

@Configuration
public class SchedulerConfig {

    @Bean(name = "scheduler")
    public SchedulerBo suchedulerBo() {

        return new SchedulerBo();

    }

}
