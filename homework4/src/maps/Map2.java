package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

        List<Integer> empId = new ArrayList<>();
        empId.add(233);
        empId.add(342);
        empId.add(655);

        List<Integer> pos = new ArrayList<>();
        pos.add(1);
        pos.add(2);
        pos.add(3);

        List<Integer> symbol = new ArrayList<>();
        symbol.add(3424);
        symbol.add(4223);
        symbol.add(4452);

        Map<String , List<Integer> > map = new HashMap<>();
        map.put("employee", empId);
        map.put("reference", symbol);
        map.put("positionNumber", pos);

        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
