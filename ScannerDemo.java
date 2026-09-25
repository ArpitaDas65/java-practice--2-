import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=sc.nextLine();

        System.out.println("enter your age");
        int age =sc.nextInt();

        System.out.println("enter your percentage:");
        double percentage=sc.nextDouble();
        System.out.println("\nstudent details:");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("percentage:"+percentage);
        sc.close();
    }
    
}
