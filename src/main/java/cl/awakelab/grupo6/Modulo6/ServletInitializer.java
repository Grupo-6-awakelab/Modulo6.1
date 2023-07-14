package cl.awakelab.grupo6.Modulo6;

import cl.awakelab.grupo6.Modulo6.Modulo6Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Modulo6Application.class);
    }

}
