

public class selection {
    public static void PrintArray(int arr[])
    {
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={100,52,35,482,46,4};
        System.out.println("Before Sorting using selection sort");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<arr.length-1; ++i)
        {
            int smallest=i;
           for(int j=i+1; j<arr.length; ++j)
           {
               if(arr[smallest]>arr[j])
               {
                   smallest=j;
               }
           }
           int temp=arr[smallest];
              arr[smallest]=arr[i];
              arr[i]=temp;
        }
       System.out.println("\nAfter Using selection sort");
        PrintArray(arr);
    }
}
