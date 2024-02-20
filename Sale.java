public class Sale implements DiscountRate{
    Customer customer;
    String date;
    double serviseExpense ;
    double productExpense;


    
    

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }
    

    public String getDate() {
        return date;
    }
    


    public double getServiseExpense() {
        return serviseExpense;
    }


    public void setServiseExpense(double serviseExpense) {
        this.serviseExpense = serviseExpense;
    }


    public double getProductExpense() {
        return productExpense;
    }


    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }


    public double getTotalExpense(){
        return 0.0;
    }
    public void displayInfo(){
        
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
        return "Sale Customer \n" +"Name:"+ customer.getCustomerName() +"\nType:"
        +customer.getCustomerType()+ "\ndate=" + date +"\nServiceExpence: "+getServiseExpense()
        +"\n ProductExpence: "+ getProductExpense();
    }
     
    
    
}
