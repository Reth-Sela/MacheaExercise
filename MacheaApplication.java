import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MacheaApplication {
    public static void main(String[] args) throws Exception{
        List<Sale> saleList = new ArrayList<>();
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
        double productDiscount = sale.productDiscount(putType.toLowerCase());
        sale.setServiseExpense(serviseDiscount);
        sale.setProductExpense(productDiscount);
        saleList.add(sale);
        int Servicediscount = 0;
        if (putType.toLowerCase().equals("primium")) {
            Servicediscount = 20;
        } else if (putType.toLowerCase().equals("gold")) {
            Servicediscount = 15;
        } else if (putType.toLowerCase().equals("silver")) {
            Servicediscount = 10;
        } else {
            Servicediscount = Servicediscount;
        }

        int proDiscount = 0;
        if (putType.toLowerCase().equals("primium") || putType.toLowerCase().equals("silver")
                || putType.toLowerCase().equals("gold")) {
            proDiscount = 10;
        } else
            proDiscount = 0;

        // data after Discount

        System.out.println("\n\n                        Discount              ");
        System.out.println("\n Cuase You are the Customer Type: " + type + " So you have " + Servicediscount
                + "% on Servise and " + proDiscount + " %on Product");
        System.out.println(sale.toString());
        
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\SelaStoreReport",true));
        String string=saleList.toString();
        bufferedWriter.write(string);
        System.out.println("succesfully wrote to the file\033");
        bufferedWriter.close();
        

    }
}
