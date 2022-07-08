package sw_part2_dana.customerlistingpage;

import java.util.*;
import java.time.LocalDate;

import org.apache.tomcat.jni.Local;
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
	public List<Customer> getCustomerList() {
		List<Customer> customerList = new ArrayList<Customer>();

		Customer cust1 = new Customer((long) (1), "CustName", LocalDate.of(2001, 1, 1), "IC NO",
				LocalDate.of(2022, 7, 9), "Address");
		customerList.add(cust1);

		return customerList;
	}

}
