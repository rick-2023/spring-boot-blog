package com.hdu.blog.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public class FastJsonHttpMessageConverterEx extends FastJsonHttpMessageConverter {
    public FastJsonHttpMessageConverterEx() {
        // 在这里配置 fastjson 特性
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
        //fastJsonConfig.setSerializeConfig(SerializerFeature.WriteMapNullValue);
        this.setFastJsonConfig(fastJsonConfig);

    }

    @Override
    protected boolean supports(Class<?> clazz) {

        return super.supports(clazz);
    }
}
