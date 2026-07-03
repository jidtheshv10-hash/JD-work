package uncheck;

public class arrbounds {
    public static void main(String[] args) {
    try
    {
        int [] numbers ={10,20,30};
        System.out.println(numbers[7]);
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array index out of bounds exception");
        System.out.println("Program end");
    }
    
}
}