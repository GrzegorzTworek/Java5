package Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SzybkieSortowanie {
    public static void main(String[] args){

        public List<Integer>quicksort(List<Integer> kolekcja) {
            if (kolekcja.size()<=1) {return kolekcja;}
            List<Integer> wynik = new ArrayList<Integer>();
            List<Integer> mniejsze = new ArrayList<Integer>();
            List<Integer> wieksze = new ArrayList<Integer>();
            Integer pivot = kolekcja.remove(kolekcja.length/2);
            for (Integer obiekt : kolekcja){
                if (ibiekt<pivot) {
                    mniejsze.add(obiekt);
                } else {
                    wieksze.add(obiekt);
                }
            }
            mniejsze = quicksort(mniejsze);
            wieksze = quicksort(wieksze);
            wynik.addAll(mniejsze);
            wynik.add(pivot);
            wynik.addAll(wieksze);
        }
    }
}
