import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int [] array = {10,7,3,12,5,9,15,16,27,1,8,11};
        int [] arrayNew = new int[12];

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2!= 0){
                System.out.print(array[i] + " ");
                arrayNew[i] = array[i];
            }
        }
        System.out.println("");

        Arrays.sort(arrayNew);

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arrayNew));
    }

}
