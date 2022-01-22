package ru.project.coffeemachine.config;

//import static springfox.documentation.builders.PathSelectors.regex;
//import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
//
//import java.time.LocalDate;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

//@Configuration
//@ConditionalOnWebApplication
//@Import({
//        Swagger2DocumentationConfiguration.class,
//        BeanValidatorPluginsConfiguration.class
//})
public class SwaggerConfiguration {
//
//    @Value("${spring.application.name:CoffeeMachineApplication}")
//    private String appName;
//
////    @Value("${info.version:-}")
////    private String appVersion;
//
//    @Value("${swagger.enabled:true}")
//    private boolean enabled;
//
//    @Bean
//    public Docket apiDocket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName(appName)
//                .apiInfo(new ApiInfoBuilder().title(String.format("coffeemachine %s API", appName)).build())
//                .enable(enabled)
//                .select()
//                .apis(basePackage("ru.project.coffeemachine"))
//                .paths(regex(".*"))
////                .paths(ant("/dictionary/**"))
////                .paths(regex(".*/api/v.*"))
//                .build()
////                .pathMapping(basePath)
//                .directModelSubstitute(LocalDate.class, String.class);
////                .genericModelSubstitutes(ResponseEntity.class);
//    }
}
