
public class FindNonDuplicate {

    public static void main(String []args) {
        int[] my_array = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};



        for (int i = 0; i < my_array.length; i++)
        {
            boolean is_non_dupe = true;
            for (int j = 0; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i!=j))
                {
                    is_non_dupe = false;
                }
            }
            if(is_non_dupe){
                System.out.println(my_array[i]);
            }
        }


    }
}
