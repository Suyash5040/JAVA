import java.util.*;

//Bubble Sort
/*
class main{

    public static void printArr(int arr[]) { //print sorted array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        for(int i=0; i<arr.length-1; i++) { // outer loop
            for(int j =0; j<arr.length-i-1; j++){ // inner loop
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        printArr(arr);
    }
}
*/











//Selection Sorting
/*
class main {

    public static void printArr(int arr[]) { //print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
            printArr(arr);
        }
}
 */











class main{
        public static void printArr(int arr[]) { //print sorted array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        for(int i=1; i<arr.length; i++){
            int cur = arr[i];
            int j =i-1;
            while (j>=0 && cur < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = cur;

        }
        printArr(arr);
    }
}