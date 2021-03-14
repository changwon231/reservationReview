package vo;

public class Car {

	// ���� ����
	private int carSeq;
	private int carCode;
	private String carName;
	private String carNb;
	private String carSt; // �ڵ��� ����
	private String carWhere;// �� ��ġ
	
	// �⺻ ������
	public Car() {
		super();
	}

	public int getCarSeq() {
		return carSeq;
	}

	public void setCarSeq(int carSeq) {
		this.carSeq = carSeq;
	}

	public int getCarCode() {
		return carCode;
	}

	public void setCarCode(int carCode) {
		this.carCode = carCode;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarNb() {
		return carNb;
	}

	public void setCarNb(String carNb) {
		this.carNb = carNb;
	}

	public String getCarSt() {
		return carSt;
	}

	public void setCarSt(String carSt) {
		this.carSt = carSt;
	}

	public String getCarWhere() {
		return carWhere;
	}

	public void setCarWhere(String carWhere) {
		this.carWhere = carWhere;
	}

	// hash,equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carSeq;
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
		Car other = (Car) obj;
		if (carSeq != other.carSeq)
			return false;
		return true;
	}

	// toString
	@Override
	public String toString() {
		return "Car [carSeq=" + carSeq + ", carCode=" + carCode + ", carName=" + carName + ", carNb=" + carNb
				+ ", carSt=" + carSt + ", carWhere=" + carWhere + "]";
	}
	
	
}
