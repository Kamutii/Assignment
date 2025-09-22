import java.util.Scanner;

public class finecalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Book ID: ");
      int BookID = scanner.nextInt();

        System.out.println("Enter Due date(Number of days): ");
     int Duedate = scanner.nextInt();

        System.out.println("Enter Return date(Number of days): ");
       int Returndate = scanner.nextInt();

       int daysOverdue = Returndate-Duedate;

        int fineamount;

        if(daysOverdue<=0){
            fineamount = daysOverdue*0;
        }
        else if(daysOverdue>0&daysOverdue<=7){
            fineamount = daysOverdue*20;
        }
        else if(daysOverdue<=14){
            fineamount = daysOverdue*50;
        }
        else{
            fineamount = daysOverdue*100;
        }

        System.out.println("FINE RATES ARE AS FOLLOWS: ");
        System.out.println("Days <=0: Kshs 0");
        System.out.println("Days <=7: Kshs 20");
        System.out.println("Days <=14: Kshs 50");
        System.out.println("Days >15: Kshs 100");

        System.out.println("BookID: "+BookID);
        System.out.println("Due date: "+Duedate);
        System.out.println("Return date: "+Returndate);
        System.out.println("FINE AMOUNT: "+fineamount);

    scanner.close();

        
    }
}