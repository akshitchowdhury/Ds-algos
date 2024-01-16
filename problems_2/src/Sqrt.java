public class Sqrt {
    public int mySqrt(int x) {

        long r = x;

        while(r*r<x){

            r = (r+x/r)/2;


        }

        return (int) r;
    }

    public static void main(String[] args) {

        Sqrt sq = new Sqrt();

        System.out.println(sq.mySqrt(25)); ;
    }
}
