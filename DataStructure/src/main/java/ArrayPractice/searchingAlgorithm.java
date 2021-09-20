package ArrayPractice;

public class searchingAlgorithm {

    //Binary search

    //10,20,30,40,50,60,70

    public int binarySearch(int [] arr,int length , int element)
    {
        int max = length-1;
        int min = 0;

        while(max> min)
        {
            int mid = (max+min)/2;
            if(arr[mid] == element )
            {
                return mid;
            }else if(arr[mid] > element)
            {
                max = mid-1;
            }else
            {
                min = mid+1;
            }
        }
        return -1;

    }

}
