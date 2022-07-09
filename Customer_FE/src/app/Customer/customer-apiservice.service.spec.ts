import { TestBed } from '@angular/core/testing';

import { CustomerAPIServiceService } from './customer-apiservice.service';

describe('CustomerAPIServiceService', () => {
  let service: CustomerAPIServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomerAPIServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
