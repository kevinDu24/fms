package cn.com.leadu.fms.original;

import cn.com.leadu.fms.common.constant.FrameworkConstants;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author qiaomengnan
 * @ClassName: FmsOriginalApplication
 * @Description:
 * @date 2018/3/5
 */
@ComponentScan(basePackages = FrameworkConstants.COMPONENT_SCAN)
@EnableFeignClients(basePackages = FrameworkConstants.ENABLE_FEIGN_CLIENTS)
@MapperScan(basePackages = FrameworkConstants.MAPPER_SCAN)
@SpringBootApplication
@EnableEurekaClient
public class FmsOriginalApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmsOriginalApplication.class,args);
    }

}
