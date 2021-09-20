package ArrayPractice;

public class SortingAlgorithm {

    /*
    Bubble sort
     In seond iteration we are reducing the no. of iteration by 1 , because on each iteration the maximum element of the
     array goes to the last, therefore , we don't need to run an extra iteration for that element

     */

    public  int[] bubbleSort(int arr[])
    {
      for(int j= 0;j < arr.length-1; j++)
        {
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;


                }
            }
        }

        return arr;
    }
/*
  inserstion sort
  Time complexity = 0(n2)
 */

    /**
     *  Insertion sort - each time first loop increases by 1
     *  2nd loop runs as the value of first loop and sort the array in Asending order
     * @param arr
     * @return
     */

    public int[] insertionSort(int[] arr)
    {
        int i, j, key;
        for (i = 1; i <= arr.length-1; i++)
        {
            j = i;
            while (j > 0 && arr[j - 1] > arr[j])
            {
                key = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = key;
                j--;
            }
        }


        return arr;
    }

    /*
      2nd approch - Different way of insersertion sort
     */

    public int[] insersionSrt(int[] arr)
    {
        for(int i =1 ;i< arr.length;i++)
        {
            int temp= arr[i];
            int j = i-1;
            while( j>=0 && temp < arr[j])
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1]=temp;

        }
        return arr;
    }


    /**
     * Selection sort - In this algorithm , we will select smallest element in the array and then replace the smallest element with the index of
     * first iteration .
     * Find the smallest element in 2nd iteration and replace the value with the element in first element
     * @param arr
     * @return
     */
    public int[] selectionSort(int [] arr)
    {
        int i,j;


        for(i =0; i<arr.length;i++)
        {
            int small  = arr[i];
            int index = i;
            for (j=i+1 ;j < arr.length; j++)
            {
                if(arr[j] < small)
                {
                    small = arr[j];
                    index = j;

                }
            }

            int temp = arr[i];
            arr[i] = small;
            arr[index]= temp;



        }

        return arr;
    }


    /*
       mySortingLogic sort

       second Iteration has to run till key , because we are soring the data on basis of key

     */

    public int [] mySortingLogic(int [] arr)
    {
        int key = 0;
        for (int i = 0;i<arr.length-1;i++)
        {
            key = arr[i+1] ;
            for(int j=0;j < i+1;j++)
            {
                if(arr[j] > key)
                {
                    int temp = key;
                    key = arr[j];
                    arr[j]= temp;

                }
            }
        }

        return arr;
    }

    /**
     * Quick sort - Logic : consider the last element as pivot element
     * bring all element that is lesser then pivot to its left
     * bring all element that is grater then pivor to its right
     * i value will only increase if j values is less then the pivot , it means i will always holds a index
     * whose element is less then pivot as a mark.
     *
     * J will keep on moving to identify all the element that are lesser then pivot
     *
     * it will keep on breaking the array to a smaller set of array in a recursive format
     * @param arr
     * @param low
     * @param high
     * @return
     */


    public int quickSort(int[] arr, int low , int high)
    {
        int i = low-1;
        int pivot = arr[high];


        for(int j = low ; j < high ; j++)
        {
            if(arr[j]<= pivot)
            {
                i++;

                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }

        }
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;


        return i+1;

    }

    public int[] quickSortMain(int arr[], int low, int high)
    {

        if(low< high) {
            int pi = quickSort(arr, low, high);

            quickSortMain(arr, low, pi - 1);
            quickSortMain(arr, pi + 1, high);
        }


        return arr;
    }



    // Quick sort pivot as middle element
    //10,1,5,7,10,12,18

    public int[] quickSortMiddlePivot(int a[], int left_index, int right_index)
    {
        int left, right, pivot;
        if(left_index >= right_index) return a;

        left = left_index;
        right = right_index;

        // pivot selection
        pivot = a[(left_index + right_index) /2];

        // partition
        while(left <= right) {
            while(a[left] < pivot) left++;
            while(a[right] > pivot) right--;
            if(left <= right) {
                int temp;
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++; right--;
            }

        }

        // recursion
        quickSortMiddlePivot(a,left_index,right);
        quickSortMiddlePivot(a,left,right_index);

        return a;
    }
    // 10,20,1,3,4,11
    //10 20
public int[] mergesort(int[] arr, int low , int high )
{
    if(low<high)
    {
        int mid = (low+high)/2;

        mergesort(arr , low,mid);
        mergesort(arr , mid+1, high);
        merge(arr,low,mid,high);

    }
    return arr;
}

public void merge(int arr[], int low, int mid,int high)
{
    int[] n1 = new int[mid-low+1];
    int[] n2 = new int[high- mid];
    //int[] arr1 = new int[arr.length];

    for(int i=0;i<n1.length;i++)
    {
        n1[i]= arr[low+i];
    }
    for(int i=0;i<n2.length;i++)
    {
        n2[i]= arr[mid+1+i];
    }
    int i= 0;
    int  k = low;
    int j = 0;
    while(i <n1.length && j< n2.length)
    {
        if(n1[i]<n2[j]) {
            arr[k] = n1[i];
            i++;
        }else
        {
            arr[k] = n2[j];
            j++;
        }
        k++;
    }

    while(i < n1.length)
    {
      arr[k] = n1[i];
      i++;
      k++;
    }
    while(j < n2.length)
    {
        arr[k] = n2[j];
        j++;
        k++;
    }

}





    public void traverseArray(int[] arr)
    {
        for(int i = 0 ;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }


}
