package com.moss.spring.springbootstudy;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class SpringBootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}

	@Profile("local")
	@Bean
	public Server h2TcpServer() throws SQLException {
		Server h2Server = Server.createTcpServer().start();
		if (h2Server.isRunning(true)) {
			System.out.println("H2 server was started and is running.");
			return h2Server;
		} else {
			throw new RuntimeException("Could not start H2 server.");
		}
	}
}
