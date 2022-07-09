import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { Customer } from '../Customer/customer';
import { CustomerAPIServiceService } from '../Customer/customer-apiservice.service';
import { AgeValidator } from '../Customer/custom-validators/age.validator';

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
    name: ['', [Validators.required, Validators.pattern("[a-zA-Z][a-zA-Z]+")]],
    dob: '',
    idNo: ['', [Validators.required, Validators.pattern("^[0-9]*$")]],
    regDate: ['', AgeValidator],
    address: ''
  });

  get age(){
    return this.customerForm.get('regDate');
  }

  onSubmit(){
    if(!this.customerForm.valid){
      alert('Unable to create account. The customer is not of age of 18 and above.');
      return false;
    } 
  }

  /*
  addCustomer(customer : Customer){
    this.customerService.addCustomer(customer);
    window.alert('User added successfully');
  }
  */

}
