package op_javacore.entity;

public class SinhVien {

  //static là hàm tĩnh (ham du lieu kh doi)
  //nhung thu thuoc class thi kh thuoc object,but những thu thuộc object thi se thuoc class
  //static thuoc ve class
  //lop sinh ra trc object
  //toi uu hieu suat trong viec khai bao
  public static String school = "FPT";
  private String name;
  private String mssv;
  private int age;
  private String major;

  public SinhVien(String name, String mssv, int age, String major) {
    this.name = name;
    this.mssv = mssv;
    this.age = age;
    this.major = major;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMssv() {
    return mssv;
  }

  public void setMssv(String mssv) {
    this.mssv = mssv;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }
}
