import java.util.Scanner;
public class discount{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double discount;

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the amount purchased: ");
        double amount = scanner.nextDouble();
         
         if(amount>5000){
            discount = amount*0.1;
         }
         else if(amount>=10000&&amount<=5000){
            discount = amount*0.05;
         }
         else{
            discount = 0;
         }

         double amountToPay = amount - discount;

         System.out.println("Initial amount "+amount);
         System.out.println("Discount "+discount);
         System.out.println("Amount to pay "+amountToPay);
         
         scanner.close();
    }
}