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
public class QLNV {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    public void nhapDS(){
        System.out.println("Nhap ma: ");
        String maNhanVien = sc.nextLine();
        System.out.println("Nhap ten: ");
        String tenNhanVien = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        int luongCoBan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap phong ban:");
        String phongBan = sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        String chucVu = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        int namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Xin moi nhap gioi tinh: ");
        boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());
       NhanVien nhanVien = new NhanVien(maNhanVien, tenNhanVien, chucVu, phongBan, namSinh, gioiTinh);
        listNhanVien.add(nhanVien);
    }
    public ArrayList<NhanVien> xuatDS(){
        return listNhanVien;
    }
    public ArrayList<NhanVien> timKiem(String phongBan){
        ArrayList<NhanVien> ketQuaTim = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if(nhanVien.getPhongBan().equals(phongBan)){
                ketQuaTim.add(nhanVien);
            }
        }
        return ketQuaTim;
    }
    public ArrayList<NhanVien> tuoi(int tuoi){
        ArrayList<NhanVien> ketQua = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            ketQua.add(nhanVien);
        }
        return ketQua;
    }
}
