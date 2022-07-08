package sw_part2_dana.customerlistingpage;

import java.util.*;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sw_part2_dana.Customer.Customer;

@SpringBootApplication
@RestController
public class CustomerListingPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerListingPageApplication.class, args);
	}

	@GetMapping
	public List<String> hello(){
		List<String> helloList = new ArrayList<String>();

		helloList.add("Hello");
		helloList.add("World");

		return helloList;
	}
	
}
