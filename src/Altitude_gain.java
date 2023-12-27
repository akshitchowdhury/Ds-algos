import java.util.Arrays;

public class Altitude_gain {
    public int largestAltitude(int[] gain) {

        int high_alt = 0;

        int[] ngain = new int[gain.length+1];
            ngain[0] = 0;
        for(int i=1; i< ngain.length; i++){

            ngain[i] = ngain[i-1]+ gain[i-1];

        }

         Arrays.sort(ngain);


            high_alt = ngain[ngain.length-1];

        return high_alt;
    }

}
