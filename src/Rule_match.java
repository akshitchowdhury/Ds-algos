import java.util.List;

public class Rule_match {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count =0;

        for(List <String> list: items){
            String val = " ";
            switch(ruleKey){
                case "type":
                    val = list.get(0);
                    break;

                case "color":
                    val = list.get(1);
                    break;

                case "name":
                    val = list.get(2);
                    break;
            }

            if(val.equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}
