package br.com.tarcnux.labpadroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot gerado via VSCode Spring Initializer.
 * Os seguintes módulos foram selecionados:
 * - Spring DAta JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * @author Tarcnux
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
