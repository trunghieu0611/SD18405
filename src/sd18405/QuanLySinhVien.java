/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18405;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class QuanLySinhVien {
    public ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma:");
        String ma = sc.nextLine();
        System.out.println("Nhap ho ten:");
        String hoTen = sc.nextLine();
        System.out.println("Nhap dia chi:");
        String diaChi = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap lop:");
        String lop = sc.nextLine();
        System.out.println("Nhap diem:");
        int diem = Integer.parseInt(sc.nextLine());
        SinhVien sinhVien = new SinhVien(hoTen, hoTen, diaChi, tuoi, lop, diem);
        listSinhVien.add(sinhVien);
    }
    public ArrayList<SinhVien> xuatSinhVien(){
        return listSinhVien;
    }
   public ArrayList<SinhVien> timKiem(String hoTen){
       ArrayList<SinhVien> ketQuaTimKiem = new ArrayList<>();
       for (SinhVien sinhVien : listSinhVien) {
           if(sinhVien.getHoTen().equals(hoTen)){
               ketQuaTimKiem.add(sinhVien);
           }
       }
       return ketQuaTimKiem;
   }

    public ArrayList<SinhVien> timDiem(float diem){
        ArrayList<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sinhVien : listSinhVien) {
           if(sinhVien.getDiem()>diem){
               ketQua.add(sinhVien);
           }
       }
       
        return ketQua;
    }
}
