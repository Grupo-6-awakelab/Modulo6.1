package cl.awakelab.grupo6.Modulo6.controller;

import cl.awakelab.grupo6.Modulo6.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class Modulo6Application {

    public static void main(String[] args) {
        SpringApplication.run(Modulo6Application.class, args);
    }

}
