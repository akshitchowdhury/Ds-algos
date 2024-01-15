public class Sqrt {
    public int mySqrt(int x) {

        long r = x;

        while(r*r<x){

            r = (r+x/r)/2;


        }

        return (int) x;
    }

    public static void main(String[] args) {

        Sqrt sq = new Sqrt();

        sq.mySqrt(25);
    }
}
