/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public QuanLyNhanVien() {
          listNhanVien.add(new NhanVien("NV1","Nguyen Van A","Nam","SD1234"));
          listNhanVien.add(new NhanVien("NV2","Nguyen Van A","Nam","SD1232"));
            listNhanVien.add(new NhanVien("NV3","Nguyen Van A","Nam","SD1233"));
    }
    
    ArrayList<NhanVien> getListNhanVien(){
        
            return listNhanVien;
    }
    boolean addNew(NhanVien nhanVien){
        listNhanVien.add(nhanVien);
        return true;
    }
}
