package cheetahgo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("cheetahgo.mapper")
public class cheetahGoAutoTestApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(cheetahGoAutoTestApplication.class);
        builder.headless(false).web(WebApplicationType.SERVLET).run(args);
    }
}
