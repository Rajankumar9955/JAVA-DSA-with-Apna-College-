public class bubble {
    public static void main(String args[]){
        int []arr={45,86,4,5,6,75,7};
        System.out.println("Before Sorting Bubble sort");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<arr.length-1; ++i)
        {
            for(int j=0; j<arr.length-i-1; ++j)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        System.out.println("\nAfter Sorting");
        for(int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
