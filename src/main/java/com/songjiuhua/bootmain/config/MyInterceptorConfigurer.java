package com.songjiuhua.bootmain.config;

import com.songjiuhua.bootmain.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created on 2016/10/20.
 * @Author SongJiuHua.
 * @description 配置拦截器
 */
@Configuration
public class MyInterceptorConfigurer extends WebMvcConfigurerAdapter{

    /**
     * 配置拦截器，可以配置多个拦截器，配置的拦截器的顺序即是执行的顺序
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/test/**");
        super.addInterceptors(registry);
    }

}
