public class stringbuffer 
{
    public static void main(String args[])
    {
        StringBuffer str=new StringBuffer("Hello World ");
        System.out.println("String length is : "+str.length());
        System.out.println(str.reverse());
        System.out.println(str.append("Java"));
        System.out.println(str.insert(5," Java"));
        System.out.println(str.delete(5,11));
        System.out.println(str.replace(0,5,"Hi"));
        System.out.println("Character at index : "+str.charAt(2));
    }
}