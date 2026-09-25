public class datatypesoperator {
    public static void main(String[] args) {
        //primitive datatypes
        byte b=10;
        short s = 1000;
        int i=50000;
        long l=100000L;
        float f=10.5f;
        double d=25.75;
        char c='A';
        boolean flag=true;
        System.out.println("byte:"+b);
        System.out.println("short:"+s);
        System.out.println("long:"+i);
        System.out.println("long:"+l);
        System.out.println("float:"+f);
        System.out.println("double:"+d);
        System.out.println("character:"+c);
        System.out.println("boolean:"+flag);

        //arithmetic operators
        int x =20,y =10;

        System.out.println("\nArithmetic operators");
        System.out.println("addition="+(x+y));
        System.out.println("subtraction="+(x-y));
        System.out.println("multiplication="+(x*y));
        System.out.println("division="+(x/y));
        System.out.println("modulus="+(x%y));
        //relational operators
        System.out.println("\nRelational operators");
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x==y);

        //logical operators
        System.out.println("\nLogical operators");
        System.out.println(x>10&&y<20);
        System.out.println(x>30||y<20);
        System.out.println(!(x==y));
        //increment and decrement
        x++;
        y--;

        System.out.println("\nAfter increment / decrement");
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
    
}
