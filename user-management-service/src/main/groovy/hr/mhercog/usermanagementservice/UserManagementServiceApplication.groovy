package hr.mhercog.usermanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

import hr.mhercog.usermanagementservice.UserManagementServiceApplication

@SpringBootApplication
@EnableDiscoveryClient
@EnableJdbcHttpSession
public class UserManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementServiceApplication, args);
	}
}
