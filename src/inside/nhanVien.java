package inside;

public class nhanVien extends chucVu {
	private String maNhanVien , hoVaTen ,queQuan ;
	private int namSinh ;
	public nhanVien(double luong, String chucVu, String maNhanVien, String hoVaTen, String queQuan, int namSinh) {
		super( chucVu);
		this.maNhanVien = maNhanVien;
		this.hoVaTen = hoVaTen;
		this.queQuan = queQuan;
		this.namSinh = namSinh;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	@Override
	public String toString() {
		return "nhanVien [maNhanVien=" + maNhanVien + ", hoVaTen=" + hoVaTen + ", queQuan=" + queQuan + ", namSinh="
				+ namSinh + "]";
	}
	
	
}
