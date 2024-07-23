package op_javacore.entity;

public class SinhVienTN extends SinhVien {

  private Double toan;
  private Double ly;
  private Double hoa;
  private Double sinh;

  public SinhVienTN(String name, String mssv, int age, String major, Double toan, Double ly,
      Double hoa, Double sinh) {
    //super co truyen tham so và có the kh truyen tham so
    //super(); thuong kh de tham so trong super
    super(name, mssv, age, major);
    this.toan = toan;
    this.ly = ly;
    this.hoa = hoa;
    this.sinh = sinh;
  }

  public Double getToan() {
    return toan;
  }

  public void setToan(Double toan) {
    this.toan = toan;
  }

  public Double getLy() {
    return ly;
  }

  public void setLy(Double ly) {
    this.ly = ly;
  }

  public Double getHoa() {
    return hoa;
  }

  public void setHoa(Double hoa) {
    this.hoa = hoa;
  }

  public Double getSinh() {
    return sinh;
  }

  public void setSinh(Double sinh) {
    this.sinh = sinh;
  }

  public Double calculateDTB_TN() {
    return (toan + (ly * 2) + (hoa * 2) + (sinh * 2)) / 5;
  }
}
