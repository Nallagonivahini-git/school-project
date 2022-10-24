package com.acs.studentDetails;

import com.acs.studentDetails.dao.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
public class StudentPortalApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentPortalApplication.class, args);
	}

}
