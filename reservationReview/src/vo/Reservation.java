package vo;

public class Reservation {

	//변수 선언
	private int resSeq;
	private int resDate;
	private String resStatus;
	
	// 기본생성자
	public Reservation() {
		super();
	}
	
	// getter, setter
	public int getResSeq() {
		return resSeq;
	}
	public void setResSeq(int resSeq) {
		this.resSeq = resSeq;
	}
	public int getResDate() {
		return resDate;
	}
	public void setResDate(int resDate) {
		this.resDate = resDate;
	}
	public String getResStatus() {
		return resStatus;
	}
	public void setResStatus(String resStatus) {
		this.resStatus = resStatus;
	}

	// hash, equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + resSeq;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (resSeq != other.resSeq)
			return false;
		return true;
	}

	// toString
	@Override
	public String toString() {
		return "Reservation [resSeq=" + resSeq + ", resDate=" + resDate + ", resStatus=" + resStatus + "]";
	}
	
	
}
