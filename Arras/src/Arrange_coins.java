public class Arrange_coins { public int arrangeCoins(int n) {

    int rows = 0;

    for(int i=1; i<= n; i++){

        n = n-i;
        if(n>=0){

            rows++;
        }


        else{
            break;
        }
    }
    return rows;

}
}
