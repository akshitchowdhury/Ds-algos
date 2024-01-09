import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Words_container {


    public List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> store = new ArrayList<Integer>();

        String word = Character.toString(x);
        for(int i=0 ; i<words.length; i++){

            if(words[i].contains(word)){

                store.add(i);
            }


        }


        return store;

    }


    public static void main(String[] args) {
        String[] words = {"abc", "apple"};

        char x = 'a';

        String y = "tester";

//        System.out.println(y.contains("t"));

        String word = Character.toString(x);
//        System.out.println(y.contains(word));
        for(int i=0 ; i<words.length; i++){

            if(words[i].contains(word)){

                System.out.println(i);
            }


        }












    }
}
