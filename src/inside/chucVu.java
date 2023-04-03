package inside;

import java.util.Objects;

public class chucVu {
	private double luong ; 
	private String chucVu;
	
	public chucVu( String chucVu) {
		
		
		this.chucVu = chucVu;
		if (this.chucVu=="fresher") {
			this.luong=10000000;
		}
		else if (this.chucVu=="junior") {
			this.luong=20000000;
		}
		else if (this.chucVu=="senior") {
			this.luong=40000000;
		}
		else if (this.chucVu=="master") {
			this.luong=60000000;
		}
	}
	public void ganLuong() {
		
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(chucVu, luong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		chucVu other = (chucVu) obj;
		return Objects.equals(chucVu, other.chucVu)
				&& Double.doubleToLongBits(luong) == Double.doubleToLongBits(other.luong);
	}
	@Override
	public String toString() {
		return "chucVu [luong=" + luong + ", chucVu=" + chucVu + "]";
	}
}
