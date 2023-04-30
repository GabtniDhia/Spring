package tn.esprit.nids.dhiagabtni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DhiaGabtniApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhiaGabtniApplication.class, args);
    }
}
