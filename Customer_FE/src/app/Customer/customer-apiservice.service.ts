import { Injectable } from '@angular/core';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerAPIServiceService {

  customers : Customer[] = [];

  addCustomer(customer : Customer){
    this.customers.push(customer);
  }
  
  constructor() { }
}
