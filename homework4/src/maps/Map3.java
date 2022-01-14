package maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map3 {
    public static void main(String[] args) {
        List<Character> name = new ArrayList<>();
        name.add('F');
        name.add('G');

        List<Character> abbreviation = new ArrayList<>();
        abbreviation.add('D');
        abbreviation.add('R');

        List<Character> sport = new ArrayList<>();
        sport.add('S');
        sport.add('M');

        Map<String,List<Character>> map = new LinkedHashMap<>();
        map.put("first name",name);
        map.put("last name", abbreviation);
        map.put("activity", sport);
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }



    }
}
