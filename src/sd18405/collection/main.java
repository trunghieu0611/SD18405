/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.forEach(x -> System.out.println("\t" + x));
//System.out.println(list.toString());
        Set<Integer> listSet = new HashSet<>();
        listSet.add(100);
        listSet.add(200);
        listSet.add(200);
        System.out.println("\n");
        listSet.forEach(x -> System.out.println("\t" + x));
        //System.out.println(listSet.toString());
        listSet.addAll(list);
        listSet.forEach(x -> System.out.println(x));

    }
}
