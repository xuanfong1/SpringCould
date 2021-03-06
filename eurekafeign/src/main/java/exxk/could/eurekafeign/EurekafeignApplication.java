package exxk.could.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class EurekafeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekafeignApplication.class, args);
    }
}
