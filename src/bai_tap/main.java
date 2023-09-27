/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       QLNV quanLyNhanVien = new QLNV();
       String check ="";
       while(true){
           quanLyNhanVien.nhapDS();
           System.out.println("Ban co muon nhap tiep ko: ");
           check = sc.nextLine();
           if(check.equals("no")){
               break;
           }
       }
        ArrayList<NhanVien> list = quanLyNhanVien.xuatDS();
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien.toString());
        }
        System.out.println("Xin moi nhap phong ban can tim: ");
        String phongBan = sc.nextLine();
        ArrayList<NhanVien> ketQuaTimKiem = quanLyNhanVien.timKiem(phongBan);
        if(ketQuaTimKiem.isEmpty()){
            System.out.println("Khong tim thay");
        }
        else{
            System.out.println(ketQuaTimKiem.toString());
        }
       
        int tuoi = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ketQua = quanLyNhanVien.tuoi(tuoi);
        for (NhanVien nhanVien : ketQua) {
           
        }
}
}