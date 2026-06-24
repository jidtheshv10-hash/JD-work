public class strmethod
{
    public static void main(String args[])
    {
        String str="Hello World ";
        System.out.println("String length is : "+str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("Character at index : "+str.charAt(2));
        System.out.println("Index of 'Java' : "+str.indexOf("Java"));
        System.out.println("Substring : "+str.substring(2,7));
        System.out.println("String after replacing : "+str.replace("World","Java"));
        System.out.println("String after trimming : "+str.trim());
        System.out.println("Contains 'Hello' : "+str.contains("Hello"));
        String str2="Hello Java";
        System.out.println("str equals str2 : "+str.equals(str2));
    }
}