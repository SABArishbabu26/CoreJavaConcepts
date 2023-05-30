package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public void mapExample(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"saba");
        map.put(2,"babu");
        map.put(4,"kumar");
        map.put(3,"obi");
        map.put(5,"yamaha");

        for(Map.Entry<Integer,String> map1: map.entrySet()){
            System.out.println(map1.getKey()+" " + map1.getValue());
        }
    }

    public void mapSorting(){
        Map<Integer,String> bike = new HashMap<>();
        bike.put(30,"Suzuki");
        bike.put(2345,"Yamaha");
        bike.put(545,"KTM");
        bike.put(10,"Bajaj");
        bike.put(214,"Hero");
        bike.put(889,"Honda");
        bike.put(624565,"Ola");

        System.out.println("Unsorted map"+"\n"+bike);

        Map<Integer,String> sortedBike = new TreeMap<>(bike);
        System.out.println("Sorted map");
        for(Map.Entry<Integer,String> map1: sortedBike.entrySet()){
            System.out.println(map1.getKey()+ " "+ map1.getValue());
        }
    }

    public static void main(String[] args) {
        MapExamples m = new MapExamples();
        //m.mapExample();
        m.mapSorting();
    }
}
