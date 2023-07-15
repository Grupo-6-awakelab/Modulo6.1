package cl.awakelab.grupo6.Modulo6;

import cl.awakelab.grupo6.Modulo6.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class Modulo6Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Modulo6Application.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Modulo6Application.class);
    }
}
