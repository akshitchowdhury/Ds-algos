public class R1_basics {

    public static void main(String[] args) {

        R1_basics re = new R1_basics();

        re.recall(1);
    }

    public void recall(int num) {

        if(num==5){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        recall(num+1);

    }
}
