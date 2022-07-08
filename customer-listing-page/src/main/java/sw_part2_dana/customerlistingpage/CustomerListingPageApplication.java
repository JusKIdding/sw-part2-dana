package sw_part2_dana.customerlistingpage;

import java.util.*;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sw_part2_dana.customerlistingpage.Customer.Customer;
import sw_part2_dana.customerlistingpage.Customer.CustomerController;

@SpringBootApplication
@ComponentScan(basePackageClasses = CustomerController.class)
public class CustomerListingPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerListingPageApplication.class, args);
	}
}
