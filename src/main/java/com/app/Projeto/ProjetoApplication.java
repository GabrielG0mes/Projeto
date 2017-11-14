package com.app.Projeto;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class ProjetoApplication {

	private static Logger log = Logger.getLogger(ProjetoApplication.class);

	@Bean
	public DataSource dataSource(Environment environment) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:file:./test");
		dataSource.setUsername("admin");
		dataSource.setPassword("admin");
		return dataSource;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		log.info("#   # ##### #     #      ###      # # # ##### ####  #     #### ");
		log.info("#   # #     #     #     #   #     # # # #   # #   # #     #   #");
		log.info("##### ###   #     #     #   #     # # # #   # ####  #     #   #");
		log.info("#   # #     #     #     #   #     # # # #   # # #   #     #   #");
		log.info("#   # ##### ##### #####  ###       # #  ##### #  #  ##### #### ");
	}

}
