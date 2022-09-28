/*
Linear Search:
            Is defined as a sequential search algorithm that starts at one end and goes through each element of a list until the desired element is found, 
            otherwise the search continues till the end of the data set.It is the easiest searching algorithm.


ALGORITHM :
Step 1: Start 
Step 2: Declare an array and search element as key.
Step 3: Traverse the array until the number is found.
Step 4: If the key element is found, return the index position of the array element
Step 5: If the key element is not found, return -1
Step 6: Stop.
*/

// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise
// return -1
class LinearSearch {
    // This function returns index of element x in arr[]
    static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }
 
        // return -1 if the element is not found
        return -1;
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length;
         
        int x = 4;
 
        int index = search(arr, n, x);
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}

/* Space Complexity of Linear Search is O(1).
It means that the amount of memory your algorithm consumes doesn't depend on the input. The algorithm should use the same amount of memory for all inputs.
So, the linear search only need one element need(that is the variable you used to compare with all the elements in the array), 
so no matter how big or small your array is, the algorithm only consumes the same amount of memory for all input, and thus is space complexity is O(1)

Time Complexity of Linear Search is O(n).

*/