package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int [] array = {4, 3, 2, 10, 12, 1, 5, 7, 6, 9, 8, 11};
        for (int i=0; i< array.length;i++){
            int index =i;
            for (int j=i+1;j< array.length; j++)
                if (array[j]<array[index])
                    index = j;
            int smallestNumberSoFar = array[index];
            array[index] = array[i];
            array[i] = smallestNumberSoFar;
        }

        for (int n=0; n< array.length;n++){
            System.out.println(array[n]);
        }
    }
}
