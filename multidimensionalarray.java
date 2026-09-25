public class multidimensionalarray {
public static void main(String[] args) {
    //creating a 2d array
    int[][] matrix={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    //accessing an element
    int element =matrix[1][2];

System.out.println("element at row 1, column 2:" +element);
//displaying the complete matrix
System.out.println("matrix:");
for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[i].length;j++){

    System.out.println(matrix[i][j]+"  ");    
}

System.out.println();
}    
}
}
