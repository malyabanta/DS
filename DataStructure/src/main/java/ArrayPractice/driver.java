package ArrayPractice;

public class driver {
    public static void main(String args[])
    {
        SortingAlgorithm s = new SortingAlgorithm();
        System.out.println("i am from main class");

        int[] Arr = new int[]{6,4,5,1,3,10,7,2};
        int [] arr = new int[]{23,10,4,88,1,3,10};
        int [] arr1 = new int[]{9,11,4,88,1,3,10};
        int [] arr2 = new int[]{10,1,5,7,10,12,18};
        int [] arr3 = new int[]{38,27,43,3,9,82,10};
      /*
        //SORTING ALGORITHM

        System.out.println("calling Bubble sort");

       int[] Arr2 =  s1.bubbleSort(Arr);
        s1.traverseArray(Arr2);

        System.out.println("calling mySortingLogic sort");
        int[] Arr3 = s1.mySortingLogic(Arr);
        s1.traverseArray(Arr3);



        System.out.println("calling Insertion sort");
        int[] Arr4 = s1.insertionSort(Arr);
        s1.traverseArray(Arr4);


        System.out.println("calling Selection sort");
        int[] Arr5 = s1.selectionSort(arr);
        s1.traverseArray(Arr5);

        System.out.println("calling Quick sort");
        int[] Arr6 = s1.quickSortMain(arr1,0,arr1.length-1);
        s1.traverseArray(Arr6);

        System.out.println("calling Quick sort - consider Pivot as middle element ");
        int[] Arr7= s1.quickSortMiddlePivot(arr2,0,arr1.length-1);
        s1.traverseArray(Arr7);




        int[] Arr3 = new int[] {5,10,12,3,52};
        System.out.println("calling merge sort - consider Pivot as middle element ");
        int[] Arr8= s.mergesort(Arr3,0,Arr3.length-1);
        s.traverseArray(Arr8);

        int[] arr4 = new int[]{10,20,30,40,50,60,70,90,130};

      searchingAlgorithm s1 = new searchingAlgorithm();
      int index = s1.binarySearch(arr4,arr4.length,70);
      System.out.println("Index :" + index );

       */

       /* int[] arr10 = s.insersionSrt(arr);
        s.traverseArray(arr10);


        int[] arr11 = s.insertionSort(arr);
        s.traverseArray(arr11);



        int[] arr12 = s.mySortingLogic(arr);
        s.traverseArray(arr12);
*/
        System.out.println("calling Quick sort - consider Pivot as middle element ");
        int[] Arr7= s.quickSortMiddlePivot(arr2,0,arr1.length-1);
        s.traverseArray(Arr7);

    }
}
