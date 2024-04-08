/********************************************************************
 * Programmer:    Abhi
 * Class:  CS40S
 *
 * Assignment: Client code for searching and sorting classes
 * Program Name:  Sorter
 *
 * Description: Bubble sort method, Quick sort method, and Selection sort method
 *              done here. 
 ***********************************************************************/
public class Sorter
{
    // ** bubble sort **
    public void bubbleSort(int[] list, int length) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;

                }

            }

        }
    }

    // ** selection sort **
    public void selectionSort(int[] list, int length) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) { // i + 1 because we've solved i in previous case
                if (list[min] > list[j]) {
                    min = j;
                }
            }
            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;

        }

    }

    // ** quick sort **
    public void quickSort(int[] list, int start, int end) {

        if (end <= start) {
            return;

        }   // base case
        
        int pivot = partition(list, start, end);
        quickSort(list, start, pivot - 1);  // split the arrays into two sub-arrays, one which is less than pivot
        quickSort(list, pivot + 1, end);    // one which is greater than the pivot
    }

    // find pivot element
    private static int partition(int[] list, int start, int end) {
        int pivot = list[end]; // choosing the pivot as the end element
        int i = start - 1;  // i starts one before start for simplicity

        for(int j = start; j <= end; j++) { // j points at index 0
            if(list[j] <= pivot) {  // as j increments, when it is appeared to be less than the pivot swap with i + 1
                i++;    // i increments to select the swapping element

                // swap
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        return i;
    }
}
