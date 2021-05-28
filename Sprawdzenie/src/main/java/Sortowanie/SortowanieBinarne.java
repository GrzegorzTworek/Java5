package Sortowanie;

public class SortowanieBinarne {
    public static void main(String[] args){

        static int binaryAlgorithm(long [] a, long key){
            int low = 0;
            int high = a.length-1;

            while (low <= high){
                int mid = (low + high)/2;
                        long midVal = a[mid];

                if (midVal < key)
                    low = mid +1;
                else if (midVal>key)
                    high = mid -1;
                else
                    return mid;
                }
            return -(low +1);
            }
        }
    }

