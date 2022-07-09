import { TestBed } from '@angular/core/testing';

import { JsonApiServiceService } from './json-api-service.service';

describe('JsonApiServiceService', () => {
  let service: JsonApiServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(JsonApiServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
