package Sortowanie;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args){

        public int[] przezZliczanie(int[] kolekcja) {
            int[] zliczenia = new int[ZAKRES_WARTOSCI_MAX];
            for (int obiekt : kolekcja) {
                zliczenia[obiekt]++;
            }
            //generujemy wynik
             int wynik = new int[kolekcja.length];
             for (int i=0, j=0; i<ZAKRES_WARTOSCI_MAX; i++) {
                 while (zliczenia[i]>0) {
                    wynik[j] = i;
                    j++;
                 }
             }
             return wynik;
        }
    }
}
