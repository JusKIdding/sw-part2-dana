package sw_part2_dana.customerlistingpage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerListingPageController {

	@GetMapping("/")
	public String index() {
		return "Dana has change text here";
	}

}