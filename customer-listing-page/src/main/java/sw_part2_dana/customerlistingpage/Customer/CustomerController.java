package sw_part2_dana.customerlistingpage.Customer;

import java.time.LocalDate;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {
    
    @GetMapping
	public List<Customer> getCustomerList() {
		List<Customer> customerList = new ArrayList<Customer>();

		Customer cust1 = new Customer((long) (1), "CustName", LocalDate.of(2001, 1, 1), "IC NO",
				LocalDate.of(2022, 7, 9), "Address");
		customerList.add(cust1);

		return customerList;
	}
}
