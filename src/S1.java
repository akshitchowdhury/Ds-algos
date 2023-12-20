public class S1 {
    public static void main(String[] args) {


        String words = "ALaska";

        String[] stock = words.toLowerCase().split("");



        String[] boss = {"a","s","d","f","g","h","j","k","l"};

        String check = " ";
                for(int i=0; i<stock.length; i++){
                    for(int j=0; j<boss.length; j++){

                        if(stock[i]==boss[j]){

                            check = "stored";

                        }
                    }

        }
        ;

    }
}
