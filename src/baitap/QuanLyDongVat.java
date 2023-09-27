/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class QuanLyDongVat {
    ArrayList<DongVat> listDongVat = new ArrayList<>();
    ArrayList<DongVat> getListDongVat(){
        listDongVat.add(new DongVat("DV1","Ran","bo sat","Duc"));
        listDongVat.add(new DongVat("DV2","Ran","bo sat","Duc"));
        listDongVat.add(new DongVat("DV3","Ran","bo sat","Duc"));
        return listDongVat;
    }
}
