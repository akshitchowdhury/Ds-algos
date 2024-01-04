import java.util.Arrays;

public class Max_wealth {

    public int maximumWealth(int[][] accounts) {

        int maximum = 0;

        int store = 0;

        for(int i=0; i< accounts.length; i++){

            int proto [] = new int [accounts.length];
            for(int j=0; j< accounts[i].length; j++){

                store = store+ accounts[i][j];

                proto[i] = store;
            }

            Arrays.sort(proto);

            maximum = proto[proto.length-1];

        }

        return maximum;
    }

    public static void main(String[] args) {

        Max_wealth mw = new Max_wealth();

        int [][] accounts= {{1,5},{7,3},{3,5}};
       int check =  mw.maximumWealth(accounts);

        System.out.println(check);
    }
}
