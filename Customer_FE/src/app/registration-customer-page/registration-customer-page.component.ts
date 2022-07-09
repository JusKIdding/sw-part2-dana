import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Customer } from '../Customer/customer';
import { CustomerAPIServiceService } from '../Customer/customer-apiservice.service';

@Component({
  selector: 'app-registration-customer-page',
  templateUrl: './registration-customer-page.component.html',
  styleUrls: ['./registration-customer-page.component.css']
})
export class RegistrationCustomerPageComponent {

  constructor(
    private formBuilder: FormBuilder,
    private customerService: CustomerAPIServiceService
  ) { }

  customerForm = this.formBuilder.group({
    name: '',
    dob: '',
    idNo: '',
    regDate: '',
    address: ''
  });

  onSubmit(): void {
    //Process submit data here
    console.warn('New User information has been submitted', this.customerForm.value);
    this.customerForm.reset();
  }

  /*
  addCustomer(customer : Customer){
    this.customerService.addCustomer(customer);
    window.alert('User added successfully');
  }
  */

}
