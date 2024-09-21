public class BinarySearch 
{
    int binarySearch(int[] arr, int target) 
    {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    void printArray(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        BinarySearch bs = new BinarySearch();
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("Array elements:");
        bs.printArray(arr);
        System.out.println("elements to search : 23");
        int target = 23;
        int result = bs.binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in array");
    }
}
