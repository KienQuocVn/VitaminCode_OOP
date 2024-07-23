package op_javacore.system;

import op_javacore.entity.SinhVien;
import op_javacore.entity.SinhVienTN;
import op_javacore.service.SinhVienService;

public class hello {

  //  public static void main(String[] args) {
//    SinhVien sinhVien = new SinhVien();
//    sinhVien.setName("KKQ");
//    sinhVien.setAge(3);
//
//    System.out.println("Sinh Vien - School: " + SinhVien.school);
//    System.out.println("Sinh Vien - Name: " + sinhVien.getName());
//    System.out.println("Sinh Vien - age: " + sinhVien.getAge());
//  }
  public static void main(String[] args) {
    SinhVienTN tn = new SinhVienTN("Kien Quoc 1","1",18,"Full",10.0,10.0,10.0,10.0);
    System.out.println("name:"+tn.getName());
    System.out.println(">>>"+tn.getToan());
  }
//  public static void main(String[] args) {
//    SinhVienService service = new SinhVienService();
//    service.demo4();
//    service.demo5();
//    service.demo6();
//  }
}
