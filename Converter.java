public class Converter {
    //converts double to int 
    public int convertToInt(double num){
        return(int)num;
    }
    //convert int into double 
    public double convertToDouble(int num){
        return(double)num;
    }
    public static void main(String[] args) {
        //create converter object
        Converter converter =new Converter();
        //convert double to int
        int intvalue= converter.convertToInt(10.95);
        //convert int to double 
        double doublevalue=converter.convertToDouble(10);
//display result
System.out.println("Double converted to int:"+intvalue);
System.out.println("int converted to double:"+doublevalue);

    }
}
