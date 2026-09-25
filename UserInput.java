import java.util.Scanner;
public class UserInput{
    public static void main(String[]args){
        //create a scanner object
        Scanner scanner =new Scanner(System.in);
        //user input
        System.out.println("enter an integer:");
        //read the value from the user value
        int userInteger=scanner.nextInt();
    //process the input 
     int doubledvalue =userInteger*2;
     //display the result
     System.out.println("you entered :"+userInteger);
     System.out.println("double of"+userInteger +"is"+
    doubledvalue);
     
     scanner.close();
}
}