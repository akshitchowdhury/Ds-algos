import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_integer {

    public static void main(String[] args) {


















    }

    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list = new ArrayList<> ();

        StringBuilder joiner = new StringBuilder();
        for(int value: num){
            joiner.append(value);
        }

        String res = joiner.toString();

        int number = Integer.parseInt(res);

        int nres = number+k;

        String farr[] = Integer.toString(nres).split(",");

        for(int i=0; i< farr.length;i++){

            int setter = Integer.parseInt(farr[i]);
            list.set(i, setter) ;
        }


        return list;
    }

}
