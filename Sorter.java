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
            for (int j = 0; j < list.length; j++) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                    
                }

            }
            
        }
    
    }
}