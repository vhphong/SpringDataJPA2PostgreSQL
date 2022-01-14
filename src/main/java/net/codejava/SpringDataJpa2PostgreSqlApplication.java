package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpa2PostgreSqlApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa2PostgreSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = studentRepo.findAll();

		if (students.size() == 0) {
			System.out.println("No student records found!");
		}

		students.forEach(System.out::println);

		System.exit(0);
	}

}
