package op_javacore.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import op_javacore.entity.SinhVien;
import op_javacore.entity.SinhVienTN;

public class SinhVienService {

  private static final List<SinhVienTN> list = Arrays.asList(
      new SinhVienTN("Kien Quoc 1","1",18,"Full",10.0,10.0,10.0,10.0),
      new SinhVienTN("Kien Quoc 2","2",19,"Full",9.0,8.0,7.0,6.0),
      new SinhVienTN("Kien Quoc 3","3",20,"Full",5.1,2.0,3.0,4.0),
      new SinhVienTN("Kien Quoc 4","4",21,"Full",1.0,1.0,1.0,1.0));

  public void demo6() {
    System.out.println("Danh sách sinh viên có ĐTB_TN < 5 và + 1 điểm cho mỗi sinh viên:");
    list.stream().filter(sv -> sv.calculateDTB_TN() < 5).forEach(sv -> {
      Double newDTB = sv.calculateDTB_TN() + 1;
      System.out.println(sv.getName() + " - Điểm trung bình Tự Nhiên: " + newDTB);
    });
    System.out.println("\n");
  }

  public void demo5() {
    System.out.println("========Danh sách sinh viên có ĐTB_TN < 5 và sắp xếp theo MSSV========");
    list.stream().filter(sv -> sv.calculateDTB_TN() < 5).sorted(Comparator.comparing(SinhVien::getMssv))
        .forEach(sv -> {
          System.out.println(sv.getMssv() + " - Điểm trung bình Tự Nhiên: " + sv.calculateDTB_TN());
        });
    System.out.println("\n");
  }

  public void demo4() {
    System.out.println("========Danh sách sinh viên có ĐTB_TN >= 5 và sắp xếp theo tên=========");
    list.stream().filter(sv -> sv.calculateDTB_TN() >= 5).sorted(Comparator.comparing(SinhVien::getName))
        .forEach(sv -> {
          System.out.println(sv.getName() + " - Điểm trung bình Tự Nhiên: " + sv.calculateDTB_TN());
        });
    System.out.println("\n");
  }
}
