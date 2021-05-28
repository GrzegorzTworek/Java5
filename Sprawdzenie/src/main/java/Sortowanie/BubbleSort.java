package Sortowanie;

public class BubbleSort {

    int[] liczby = {5, 8 , 2, 56,  34, 1, 45, 78,  24, 11};

    public static void main(String[] args){

        public void bubbleSort(int[] kolekcja ){
            for (int i= 0; i<kolekcja.length; i++){
                for(int j =1; j<kolekcja.length; j++) {
                    if (kolekcja[j] < kolekcja[j - 1]) {
                        int wieksza = kolekcja[j - 1];
                        kolekcja[j - 1] = kolekcja[j];
                        kolekcja[j] = wieksza;
                    }
                }
            }
        }

        //System.out.println(bubbleSort(liczby));

    }
}
