package Sortowanie;

import java.util.Arrays;

public class MergeSortScalanie {
    public static void main(String[] args){

        public int[] scalDwie(int[] pierwsza, int[] druga){
            int[] wynik = new int[pierwsza.length + druga.length];
            int indeksWynik = 0;
            int indeksPierwszy = 0, indeksDrugi = 0;
            while (indeksPierwszy<pierwsza.length || indeksDrugi<druga.length){
                if ((indeksPierwszy<pierwsza.length &&
                    pierwsza[indeksPierwszy] < druga[indeksDrugi]) || indeksDrugi==druga.length) {
wynik[indeksWynik]=pierwsza[indeksPierwszy];
indeksPierwszy++;
}else{
wynik[indeksWynik] = druga[indeksDrugi];
indeksDrugi++;
}
indeksWynik++;
}
return wynik;
}

public int[] sortowaniePrzezScalanie(int[] kolekcja){
int podzial = kolekcja.length/2;
            int[] prawa = sortowaniePrzezScalanie(Arrays.copyOfRange(kolekcja, 0, podzial));
            int[] lewa = sortowaniePrzezScalanie(Arrays.copyOfRange(kolekcja, podzial, kolekcja.length));
            return scalDwie(prawa, lewa);
}
}
}