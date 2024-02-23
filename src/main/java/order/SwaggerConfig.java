package order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return ((Object) new Docket()
                .select())
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                .build();
    }
}
