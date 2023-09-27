/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd18405;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class SD18405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
        String check ="";
        while (true) {
            quanLySinhVien.nhap();
            System.out.println("Ban muon nhap tiep: ");
            check = sc.nextLine();
            if (check.equals("no")) {
                break;

            }
        }
        ArrayList<SinhVien> list = quanLySinhVien.xuatSinhVien();
        for(SinhVien sinhVien : list){
            System.out.println(sinhVien.toString());
        }
        System.out.println("Xin moi nhap ten can tim: ");
        String hoTen = sc.nextLine();
        ArrayList<SinhVien> ketQuaTimKiem = quanLySinhVien.timKiem(hoTen);
        if(ketQuaTimKiem.isEmpty()){
            System.out.println("Khong tim duoc");
        }else{
            System.out.println(ketQuaTimKiem.toString());
        }
        System.out.println("Xin moi nhap diem: ");
        float diem = Float.parseFloat(sc.nextLine());
        ArrayList<SinhVien> ketQua = quanLySinhVien.timDiem(diem);
        if(ketQua.isEmpty()){
            System.out.println("Khong co diem nao lon hon 5");
        }else{
            for (SinhVien sinhVien : ketQua) {
                System.out.println(sinhVien.toString());
            }
        }
        
    }
    

}
