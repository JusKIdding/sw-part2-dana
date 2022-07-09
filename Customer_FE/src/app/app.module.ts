import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from "@angular/common/http";

import { CustomerListingPageComponent } from './customer-listing-page/customer-listing-page.component';
import { RegistrationCustomerPageComponent } from './registration-customer-page/registration-customer-page.component';
import { EditCustomerPageComponent } from './edit-customer-page/edit-customer-page.component';
import { CustomermainpageComponent } from './customermainpage/customermainpage.component';
import { CustomermainpageroutingModule } from './customermainpagerouting/customermainpagerouting.module';

import { NoopAnimationsModule } from '@angular/platform-browser/animations';

//Angular Material port
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatInputModule } from '@angular/material/input';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatSortModule } from '@angular/material/sort';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';


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
    CustomermainpageroutingModule,
    NoopAnimationsModule,

    HttpClientModule,
    BrowserAnimationsModule,

    MatTableModule,
    MatPaginatorModule,
    MatInputModule,
    MatProgressSpinnerModule,
    MatSortModule,
    MatToolbarModule,
    MatButtonModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
