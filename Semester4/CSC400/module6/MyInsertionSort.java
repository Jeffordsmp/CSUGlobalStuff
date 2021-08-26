public class MyInsertionSort {
    
    public MyInsertionSort(){}

    public void accendingSort(int[] arr){
        System.out.println("\nYour Unsorted Array:");
        printArr(arr);
        int n = arr.length;
        int changes = 1;
        boolean change = false;
        for (int i = 1; i < n; i++){
            int mark = arr[i];
            int j = i - 1;

            while (j>=0 && arr[j]>mark){
                arr[j + 1] = arr[j];
                j--;
                change = true;
            }
            arr[j+1] = mark;
            if(change){
                System.out.println("Array after change " + changes + ":");
                printArr(arr);
                change = false;
                changes++;
            }
        }
        System.out.println("Your Ascending Sorted Array:");
        printArr(arr);
    }

    public void decendingSort(int[] arr){
        System.out.println("\nYour Unsorted Array:");
        printArr(arr);
        int n = arr.length;
        int changes = 1;
        boolean change = false;
        for (int i = 1; i < n; i++){
            int mark = arr[i];
            int j = i - 1;

            while (j>=0 && arr[j]<mark){
                arr[j + 1] = arr[j];
                j--;
                change = true;
            }
            arr[j+1] = mark;
            if(change){
                System.out.println("Array after change " + changes + ":");
                printArr(arr);
                change = false;
                changes++;
            }
        }
        System.out.println("Your Descending Sorted Array:");
        printArr(arr);
    }

    private void printArr(int[] arr){
        for (int x : arr) {
            System.out.print(x);
            System.out.print("  ");
        }
        System.out.println("");
        System.out.println("--------------");
    }
}
