package appunti.Maps;

import java.util.HashMap;

public class Maps2 {
    public static void main(String[] args) {

        HashMap<String, Double> menuList = new HashMap<>();

        menuList.put("Pizza", 9.60);
        menuList.put("Tagliatelle", 12.60);
        menuList.put("Salad", 9.60);

        for (String mapKey : menuList.keySet()){
            System.out.println("Our current key is : " + mapKey);

        }

        for (Double mapValue : menuList.values()){
            System.out.println("our current value is: " + mapValue);
        }

    }
}