public class Customer implements  DiscountRate {
    String customerName;
    Type customerType;
    public Customer(String customerName, Type customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String  getCustomerType() {
        return customerType.name();
    }
    public void setCustomerType(Type customerType) {
        this.customerType = customerType;
    }
    @Override
    public double getServiceMemberDiscount() {
       return 0.0;

    }
    @Override
    public double getProductMemberDiscount() {
        return 0.0;
        
    }
    @Override
    public String toString() {
        return "Customer [customerName=" + getCustomerName() + ", customerType=" + getCustomerType() + "]";
    }

    
    
}
