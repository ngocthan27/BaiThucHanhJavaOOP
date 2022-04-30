package Main;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
       
        HinhTron hinhTron = new HinhTron();
        hinhTron.display();
        hinhTron.nhapBankinh();
        hinhTron.tinhChuvi();
        hinhTron.tinhDienTich();
        hinhTron.inChuvi();
        hinhTron.inDientich();

        HinhTru hinhTru = new HinhTru();
        hinhTru.display();
        hinhTru.nhapChieucao();
        hinhTru.tinhThetich();
        hinhTru.inThetich();
        
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.display();
        hinhChuNhat.nhapChieudai();
        hinhChuNhat.nhapChieurong();
        hinhChuNhat.tinhChuvi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuvi();
        hinhChuNhat.inDientich();

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.display();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuvi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuvi();
        hinhVuong.inDientich();
    }
}