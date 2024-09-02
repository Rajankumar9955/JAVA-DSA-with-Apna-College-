


public class selection {

     public static void printArray(int arr[])
     {
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+",");
        }
     }

    public static void main(String[] args) {
        int []arr={1,2,85,63,45,6,5};
        System.out.println("Before Sorting");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+",");
        }

        for(int i=0; i<arr.length; ++i)
        {
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=current;
        }
        System.out.println("\nAfter Sorting");
        printArray(arr);
    }
    
}
