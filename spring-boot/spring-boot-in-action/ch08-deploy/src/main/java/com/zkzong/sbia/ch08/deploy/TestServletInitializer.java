package com.zkzong.sbia.ch08.deploy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Zong on 2017/3/25.
 */
public class TestServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Ch08DeployApplication.class);
    }
}
