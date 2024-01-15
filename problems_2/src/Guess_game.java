public class Guess_game {
    public static void main(String[] args) {

    }


    public int guessNumber(int n) {
        int first = 1;
        int last = n;

        while(first<=last){

            int mid = first + (last-first)/2;

            if(guess(mid)==0){
                return mid;
            }

            else if(guess(mid)==-1){
                last = mid-1;
            }

            else if (guess(mid)==1){
                first = mid+1;
            }

        }
        return -1;


    }
