package sw_part2_dana.Customer;

import java.time.LocalDate;

public class Customer {
    private Long custIDKey;

    private String custName;
    private LocalDate custDOB;
    private String custIdNo;
    private LocalDate custRegDate;
    private String custAddress;

    public Customer() {
    }

    public Customer(Long custIDKey, String custName, LocalDate custDOB, String custIdNo, LocalDate custRegdate,
            String custAddress) {
        this.custIDKey = custIDKey;
        this.custName = custName;
        this.custDOB = custDOB;
        this.custIdNo = custIdNo;
        this.custRegDate = custRegdate;
        this.custAddress = custAddress;
    }

    public Customer(String custName, LocalDate custDOB, String custIdNo, LocalDate custRegdate,
            String custAddress) {
        this.custName = custName;
        this.custDOB = custDOB;
        this.custIdNo = custIdNo;
        this.custRegDate = custRegdate;
        this.custAddress = custAddress;
    }

    public Long getCustIDKey() {
        return this.custIDKey;
    }

    public void setCustIDKey(Long custIDKey) {
        this.custIDKey = custIDKey;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public LocalDate getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(LocalDate custDOB) {
        this.custDOB = custDOB;
    }

    public String getCustIdNo() {
        return custIdNo;
    }

    public void setCustIdNo(String custIdNo) {
        this.custIdNo = custIdNo;
    }

    public LocalDate getCustRegDate() {
        return custRegDate;
    }

    public void setCustRegDate(LocalDate custRegDate) {
        this.custRegDate = custRegDate;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
    

    @Override
    public String toString() {
        return "{" +
            " custIDKey='" + getCustIDKey() + "'" +
            ", custName='" + getCustName() + "'" +
            ", custDOB='" + getCustDOB() + "'" +
            ", custIdNo='" + getCustIdNo() + "'" +
            ", custRegDate='" + getCustRegDate() + "'" +
            ", custAddress='" + getCustAddress() + "'" +
            "}";
    }

}
