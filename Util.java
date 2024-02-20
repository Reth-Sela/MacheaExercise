import java.util.Scanner;

public final class Util {
  public static  Type type;

   static Scanner scanner=new Scanner(System.in);
    
    public static String InputString(String  string){
      System.out.print(string);
      return scanner.next();
    }
    
      public static Type inputType(String s){
        String lowercase= s.toLowerCase();
        if (lowercase.equals("primium")) {
           type=type.PRIMIUM;
        }
        else if(lowercase.equals("gold")){
          type=type.GOLD;

        }
        else if(lowercase.equals("silver")){
          type=type.SILVER;
        }
        else
        type=type.NORMAL;
        
        return  type;
        
      }

      public static double inputDouble(String s)
      {
        System.out.print(s);
        return scanner.nextDouble();
      }
  

      

    
}
