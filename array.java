public class array {
    public static void main(String[] args) {
        //creating an array
        int[]numbers=new int [5];
        //inserting elememnts
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
    //accessing the first element
    int firstnumber=numbers[0];
    System.out.println("first element:"+firstnumber);
    //modifying the second element
    numbers[1]=10;
    //displaying the modified array
System.out.println("array elements:");
for (int i=0;i<numbers.length;i++){
    System.out.println(numbers[i]);
}    
//finding array lenght
int lenght=numbers.length;
System.out.println("array length:"+lenght);
    }
    
}
