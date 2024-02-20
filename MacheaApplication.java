import java.sql.Date;
import java.time.LocalDate;

public class MacheaApplication {
    public static void main(String[] args) {
        Type type;
        String name = Util.InputString("Name:");
        String putType = Util.InputString("Type:");
        type = Util.inputType(putType);
        LocalDate localDate = LocalDate.now();
        String date = localDate.toString();
        Customer customer1 = new Customer(name, type);
        Sale sale = new Sale(customer1, date);

        double produceExpence = Util.inputDouble("Product Expence: ");
        sale.setProductExpense(produceExpence);
        double serviceExpence = Util.inputDouble("Service Expence: ");
        sale.setServiseExpense(serviceExpence);
        System.out.println("\033[H\033[2J");
        // original data
        System.out.println(sale.toString());
        double serviseDiscount = sale.discount(putType.toLowerCase());
        sale.setServiseExpense(serviseDiscount);
        int discount = 0;
        if (putType.toLowerCase().equals("primium")) {
            discount = 20;
        }
        if (putType.toLowerCase().equals("gold")) {
            discount = 15;
        }
        if (putType.toLowerCase().equals("silver")) {
            discount = 10;
        } else {
            discount = discount;
        }

        // data after Discount

        System.out.println("\n\n                        Discount              ");
        System.out.println("Cuase You are the Customer Type: " + type + "So you have " + discount + "%");
        System.out.println(sale.toString());

    }

}
