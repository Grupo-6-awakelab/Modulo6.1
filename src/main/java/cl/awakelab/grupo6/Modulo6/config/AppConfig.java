package cl.awakelab.grupo6.Modulo6.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("cl.awakelab.grupo6.Modulo6")
public class AppConfig {
    Environment environment;

    public AppConfig(Environment environment) {
        this.environment = environment;
    }

}
