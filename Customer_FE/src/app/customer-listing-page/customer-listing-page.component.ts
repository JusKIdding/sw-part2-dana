import { Component, OnInit, ɵLocaleDataIndex } from '@angular/core';
import customerData_json from '../CustomerListingPage.json';

@Component({
  selector: 'app-customer-listing-page',
  templateUrl: './customer-listing-page.component.html',
  styleUrls: ['./customer-listing-page.component.css']
})
export class CustomerListingPageComponent implements OnInit {

  public customerList_JSON: {
    name: String,
    dob: String,
    idNo: String,
    regDate: String,
    address: String
  }[] = customerData_json;

  constructor() { }

  ngOnInit(): void {
  }

}
