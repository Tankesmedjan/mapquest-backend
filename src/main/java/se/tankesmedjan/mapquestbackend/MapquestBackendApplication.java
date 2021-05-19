package se.tankesmedjan.mapquestbackend;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@EnableEncryptableProperties
@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class MapquestBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapquestBackendApplication.class, args);
    }

}
