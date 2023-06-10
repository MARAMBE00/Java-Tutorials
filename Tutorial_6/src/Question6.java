public class Question6 {

    void sort (int arr[]){

        int x = arr.length;

        for (int i=0; i<x; i++){
            int minIndex = i;    //find min: in unsorted array
            for (int j=i+1; j<x; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }

            //swap the found element with first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
