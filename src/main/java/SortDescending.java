import java.util.Arrays;

public class SortDescending {

    public static void main(String[]args){
        double [] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        // Sorting the array in descending order using a simple bubble sort
        for(int i = 0; i<cgpas.length; i++){
            for(int j = i+1; j<cgpas.length; j++){
                if(cgpas[i] < cgpas[j] ){ // Compare for descending order
                    double temp = cgpas[i];//swapping cgpas[i] and cgpas[j]
                    cgpas[i] = cgpas[j];
                    cgpas[j] = temp;

                }
            }
        }


        System.out.println(Arrays.toString(cgpas));
    }
}
