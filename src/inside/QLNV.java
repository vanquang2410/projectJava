package inside;

import java.util.ArrayList;

public class QLNV extends nhanVien {
	private ArrayList<nhanVien>dsNhanVien;
//	public QLNV() {
//		this.dsNhanVien= new ArrayList<nhanVien>();
//	}
	
	public QLNV(double luong, String chucVu, String maNhanVien, String hoVaTen, String queQuan, int namSinh,
			ArrayList<nhanVien> dsNhanVien) {
		super(luong, chucVu, maNhanVien, hoVaTen, queQuan, namSinh);
		this.dsNhanVien = dsNhanVien;
	}

	public ArrayList<nhanVien> getDsNhanVien() {
		return dsNhanVien;
	}

	public void setDsNhanVien(ArrayList<nhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
	}
	public void insert(nhanVien nhanVien) {
		this.dsNhanVien.add(nhanVien);
	}
	public void remove(nhanVien nhanVien) {
		this.dsNhanVien.remove(nhanVien);
	}
	
	public void update(nhanVien nhanVien) {
		this.dsNhanVien.remove(nhanVien);
		this.dsNhanVien.add(nhanVien);
	}
}
