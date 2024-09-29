public class SecondLargest {
    public static void main(String[]args){
         double [] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
         double max = cgpas[0];
        double sLargest = cgpas[0];

        //loop
        for (int i = 0;i< cgpas.length; i++){
            if(cgpas[i] > max){
                sLargest = max; //swapping
                max  = cgpas[i];
            }
            else if (cgpas[i] >   sLargest){
                sLargest = cgpas[i];
            }
        }
        System.out.println(sLargest);
    }

}
