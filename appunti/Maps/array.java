package appunti.Maps;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;


public class array {

    public static void main(String[] args) {


    ArrayList<String> souceList = new ArrayList<>();

    souceList.add( "Salsa");
    souceList.add( "Maionese");
    souceList.add( "Kethcup");

        ArrayList<String> menuList = new ArrayList<>();

        menuList.add( "Salsa");
        menuList.add( "Maionese");
        menuList.add("Kethcup");



        System.out.println(menuList.get((menuList.size() - 1)));

        System.out.println(" ");

        System.out.println(Arrays.toString(new ArrayList[]{menuList})
                .replace("[", "")
                .replace("]", "")
        );

        System.out.println(menuList.get(0));


    }
}