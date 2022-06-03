import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Company cp;
    public static Scanner scan = new Scanner(System.in);
    public static Scanner sc = new Scanner(System.in);
    public static List<BK> bkCustomers= new ArrayList<>();
    public static void main(String[] args) {

        String ch="";
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("1.BK\n2.Cogebank\n3.Equity\n\nChoose an option:");
            ch=scan.nextLine();
            switch (ch){
                case "1":
                    bkInfo();
                    break;
                case "2":
                    cogeInfo();
                    break;
                case "3":
                    equityInfo();
                    break;
            }
        }while(ch!="");
    }
    private static void equityInfo() {
        cp =new Equity();
        System.out.println("\nEquity interest rate:"+cp.interestRate());
        System.out.println("Equity min duration: "+cp.minDuration()+"\n");
    }

    private static void cogeInfo() {

        cp =new Cogebank();
        System.out.println("\nCogebank interest rate:"+cp.interestRate());
        System.out.println("Cogebank min duration: "+cp.minDuration()+"\n");
    }

    private static void createBKAccount() {
        String acc="";
        do{
            System.out.print("Account Number:");
            acc=scan.nextLine();
            if(acc.equals("")){
                for(BK acount:bkCustomers){
                    System.out.println(acount);
                }
                return;
            }
            System.out.print("Account Name");
            String name=scan.nextLine();
            System.out.print("Account Balance");
            float bal=sc.nextFloat();
            bkCustomers.add(new BK(acc,name,bal));
        }while(!acc.equals(""));
    }

    private static void bkInfo() {
        String choice="";
        cp = new BK();
        System.out.println("\nBK interest rate:"+cp.interestRate());
        System.out.println("BK min duration: "+cp.minDuration()+"\n");
        System.out.print("Create an account?\nY (yes)\nN (no) :");
        choice=scan.nextLine();
        switch (choice){
            case "Y":
                createBKAccount();
                break;
            case "N":
                opChooser();
        }
    }

    private static void opChooser() {
        String ch="";
        do{
            System.out.print("Choose an operation:\n1.Deposit\n2.Withdraw\n");
            ch=scan.nextLine();
            switch (ch){
                case "1":
                    deposit();
                    break;
                case "2":
                    withdraw();
            }
        }while(!ch.equals(""));
    }

    private static void withdraw() {
    }

    private static void deposit() {
    }

}