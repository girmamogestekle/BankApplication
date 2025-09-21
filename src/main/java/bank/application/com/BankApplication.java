package bank.application.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
        System.out.println("===============================");
        System.out.println("Welcome to Bank Application");
        System.out.println("===============================");
	}

}
