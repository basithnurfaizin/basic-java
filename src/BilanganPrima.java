public class BilanganPrima {

    public static void main(String[] args) {
        int bil;

        for (int i=0; i<=100; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
    }
}
