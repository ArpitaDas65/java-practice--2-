//calculator using method overloading
public class Calculator {

        // adding two integer
        public int add(int num1,int num2){
            return num1+num2;
        
        }
        //adding three double
        public double add(double num1,double num2 ,double num3){
            return num1+num2+num3;
        }

    public static void main(String[] args) {
        // create calculator object
        Calculator calculator=new Calculator();
        //call the first add()method
        int result1=calculator.add(10,20);
         //call the second add()method
         double result2= calculator.add(20.06,89.00,50.00);

         //display the results
         System.out.println("sum of two int input:"+result1);
         System.out.println("sum of two double input :"+result2);
    }
    
}
