public class complex{
    public static void main(String []args)
    {
        int []arr={15,8,25,10,30};
        int largest=arr[1   ];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + largest);
    }
}
