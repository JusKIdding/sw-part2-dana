import { Component, OnInit } from '@angular/core';
import customerData_json from '../../assets/CustomerListingPage.json';
import { MatTableDataSource } from '@angular/material/table';
import { Customer } from '../Customer/customer';
import { JsonApiServiceService } from '../Customer/json-api-service.service';
// import { ApiService } from '../Customer/api.service';

@Component({
  selector: 'app-customer-listing-page',
  templateUrl: './customer-listing-page.component.html',
  styleUrls: ['./customer-listing-page.component.css']
})
export class CustomerListingPageComponent implements OnInit {

  customer:Customer[] = [];

  displayColumnHeaders: String[] = ["name", "dob", "idNo", "regDate", "address"];  

  public dataSource = new MatTableDataSource<Customer>();

  constructor(private jsonApiService : JsonApiServiceService) {}

  ngOnInit() {
    this.getCustomerInformation_JSON();
  }

  getCustomerInformation_JSON() {
    this.jsonApiService.getCustomerInformation_JSON().subscribe((res)=>{
      console.log(res);
      this.dataSource.data = res;
    })
  }

  /*
  public customerList_JSON: {
    name: String,
    dob: String,
    idNo: String,
    regDate: String,
    address: String
  }[] = customerData_json;

  dataSource = new MatTableDataSource(this.customerList_JSON);
  */

}
