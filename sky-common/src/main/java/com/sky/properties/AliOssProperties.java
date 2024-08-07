package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.alioss") //配置属性类 作用：读取配置文件yml，把这些配置项（属性）封装成Java对象
@Data
public class AliOssProperties {

    private String endpoint;    //端点
    private String accessKeyId; //访问密钥Id
    private String accessKeySecret; //访问密钥
    private String bucketName;      //OSS桶名，即对象存储空间

}
