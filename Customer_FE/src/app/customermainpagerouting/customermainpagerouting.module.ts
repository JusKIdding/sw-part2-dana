import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerListingPageComponent } from '../customer-listing-page/customer-listing-page.component';
import { RegistrationCustomerPageComponent } from '../registration-customer-page/registration-customer-page.component';
import { EditCustomerPageComponent } from '../edit-customer-page/edit-customer-page.component';

const routes: Routes = [
  { path: 'customer-listing-page', component: CustomerListingPageComponent },
  { path: 'registration-customer-page', component: RegistrationCustomerPageComponent },
  { path: 'edit-customer-page', component: EditCustomerPageComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class CustomermainpageroutingModule { }
