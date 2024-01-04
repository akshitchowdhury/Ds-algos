public class Programmer {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("++X")||operations[i].equals("X++")){

                x++;
            }
            else if(operations[i].equals("--X")||operations[i].equals("X--")){

                x--;
            }
        }


        return x;
    }


    public static void main(String[] args) {

        String [] opern = {"--X", "++X", "X++"};
        int x = 0;

        for(int i=0; i<opern.length; i++){
            if(opern[i].equals("++X")||opern[i].equals("X++")){

                x++;
            }
            else if(opern[i].equals("--X")||opern[i].equals("X--")){

                x--;
            }
        }

        System.out.println(x);

    }
}
