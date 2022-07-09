import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerListingPageComponent } from './customer-listing-page/customer-listing-page.component';
import { RegistrationCustomerPageComponent } from './registration-customer-page/registration-customer-page.component';
import { EditCustomerPageComponent } from './edit-customer-page/edit-customer-page.component';
import { CustomermainpageComponent } from './customermainpage/customermainpage.component';
import { CustomermainpageroutingModule } from './customermainpagerouting/customermainpagerouting.module';

@NgModule({
  declarations: [
    AppComponent,
    CustomerListingPageComponent,
    RegistrationCustomerPageComponent,
    EditCustomerPageComponent,
    CustomermainpageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CustomermainpageroutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
