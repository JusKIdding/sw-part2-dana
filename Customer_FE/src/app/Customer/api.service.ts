import { Injectable } from '@angular/core';
import { Customer } from './customer';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private httpClient: HttpClient) { }

  getCustomerInformation_JSON(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(`${environment.baseUrl}CustomerListingPage.json`);
  }
}
