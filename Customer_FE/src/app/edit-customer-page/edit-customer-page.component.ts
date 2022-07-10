import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { CustomerAPIServiceService } from '../Customer/customer-apiservice.service';


@Component({
  selector: 'app-edit-customer-page',
  templateUrl: './edit-customer-page.component.html',
  styleUrls: ['./edit-customer-page.component.css']
})
export class EditCustomerPageComponent implements OnInit {

  constructor(
    private formBuilder: FormBuilder,
    private customerService: CustomerAPIServiceService
  ) { }

  customerForm = this.formBuilder.group({
    name: {value: 'placeholder', disabled: true},
    // name: ['', [Validators.required, Validators.pattern("[a-zA-Z][a-zA-Z]+")]],
    dob: {value: '', disabled:true},
    idNo: ['', [Validators.required, Validators.pattern("^[0-9]*$")]],
    regDate: {value: '', disabled:true},
    address: ''
  });

  ngOnInit(): void {
  }

  onSubmit(){
    console.log("Testing");
  }

}
