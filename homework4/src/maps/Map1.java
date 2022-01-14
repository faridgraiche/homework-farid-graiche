package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        List<String> ToyotaCars = new ArrayList<>();
        ToyotaCars.add("camry");
        ToyotaCars.add("Rav4");
        ToyotaCars.add("corolla");

        List<String> MercedesCars = new ArrayList<>();
        MercedesCars.add("c 300");
        MercedesCars.add("S 500");
        MercedesCars.add("s 200");

        List<String> BMWCars = new ArrayList<>();
        BMWCars.add("m3");
        BMWCars.add("720");
        BMWCars.add("x6");

        Map<String, List<String>> map = new HashMap<>();
        map.put("toyota", ToyotaCars);
        map.put("mercedes", MercedesCars);
        map.put("BMW", BMWCars);

        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }

    }







}
