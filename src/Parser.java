import java.util.HashMap;
import java.util.Map;
// вытащить числа и знаки по отдельности
public class Parser {

    public static Map<String, String> parse(String string){
        String type = null;
        string = string.replaceAll(" ", "");
        String[] values = string.split("[/*+-]");
        String znak = string.replaceAll("[0-9a-zA-z]+", "");
        String temp = string.replaceAll("[/*+-]", "");

        //System.out.println(temp);
        if(temp.matches("[0-9]+")){
            type = "arab";
        }
        if (temp.matches("[a-zA-Z]+")){
            type = "roman";
            //
        }


        Map<String, String> map = new HashMap<>();
        map.put("firstValue", values[0]);
        map.put("secondValue", values[1]);
        map.put("operator", znak);
        map.put("type", type);


        return map;
    }

    }

