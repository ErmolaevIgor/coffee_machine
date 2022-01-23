package ru.project.coffeemachine.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayRunner {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${db.name:coffee_machine}")
    private String schema;

    @Bean
    public Flyway runFlyway() {
        Flyway flyway = Flyway.configure()
                .dataSource(url, username, password)
                .baselineDescription("0")
                .baselineOnMigrate(true)
                .validateOnMigrate(true)
                .schemas(schema)
                .load();

        flyway.migrate();

        return flyway;
    }

}
