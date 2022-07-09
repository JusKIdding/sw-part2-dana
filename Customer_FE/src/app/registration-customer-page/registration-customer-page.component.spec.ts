import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrationCustomerPageComponent } from './registration-customer-page.component';

describe('RegistrationCustomerPageComponent', () => {
  let component: RegistrationCustomerPageComponent;
  let fixture: ComponentFixture<RegistrationCustomerPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrationCustomerPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrationCustomerPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
