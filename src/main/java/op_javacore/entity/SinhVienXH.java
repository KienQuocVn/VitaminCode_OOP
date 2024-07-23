package op_javacore.entity;

public class SinhVienXH extends SinhVien {

  private Double van;
  private Double su;
  private Double dia;
  private Double gdcd;

  public SinhVienXH(String name, String mssv, int age, String major, Double dia, Double van,
      Double su, Double gdcd) {
    super(name, mssv, age, major);
    this.dia = dia;
    this.van = van;
    this.su = su;
    this.gdcd = gdcd;
  }

  public Double getVan() {
    return van;
  }

  public void setVan(Double van) {
    this.van = van;
  }

  public Double getSu() {
    return su;
  }

  public void setSu(Double su) {
    this.su = su;
  }

  public Double getDia() {
    return dia;
  }

  public void setDia(Double dia) {
    this.dia = dia;
  }

  public Double getGdcd() {
    return gdcd;
  }

  public void setGdcd(Double gdcd) {
    this.gdcd = gdcd;
  }

  public Double calculateDTB_XH() {
    return (van + (su * 2) + (dia * 2) + (gdcd * 2)) / 5;
  }
}
