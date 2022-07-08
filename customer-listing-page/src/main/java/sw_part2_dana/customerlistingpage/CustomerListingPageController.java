package sw_part2_dana.customerlistingpage;

import java.time.LocalDate;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sw_part2_dana.Customer.Customer;

@RestController
@RequestMapping(path = "api/v1/customerAPI")
public class CustomerListingPageController {	

	//@GetMapping("/CustomerListingPage")
	// public String index() {
	// 	return "Dana has change text here";
	// }

	@GetMapping
	public List<Customer> getCustomerList(){
		List<Customer> custList = new ArrayList<Customer>();

		Customer cust1 = new Customer(
			(long) 1,
			"Name",
			LocalDate.of(2001, 01, 1),
			"IC NO",
			LocalDate.of(2022, 07, 8),
			"No. 1 USJ 1/1, Jalan USJ 1, 47600 Subang Jaya"
		);

		custList.add(cust1);

		return custList;
	}

}