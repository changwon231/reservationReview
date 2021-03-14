package vo;

public class Admin {

	// ���� ����
	private int adminSeq;
	private String adminId;
	private String name;
	private String password;
	private int adminType;
	private String email;
	private String phone;
	private int regId;
	private String regDate;
	private String modId;
	private String modDate;
	
	// �⺻ ������
	public Admin() {
		super();
	}

	// getter, setter
	public int getAdminSeq() {
		return adminSeq;
	}

	public void setAdminSeq(int adminSeq) {
		this.adminSeq = adminSeq;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdminType() {
		return adminType;
	}

	public void setAdminType(int adminType) {
		this.adminType = adminType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getModId() {
		return modId;
	}

	public void setModId(String modId) {
		this.modId = modId;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
		this.modDate = modDate;
	}
	
	// hash, equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adminSeq;
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
		Admin other = (Admin) obj;
		if (adminSeq != other.adminSeq)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "������ [������ �Ϸù�ȣ=" + adminSeq + ", ������ ���̵�=" + adminId + ", �̸�=" + name + ", ��й�ȣ=" + password
				+ ", ������ Ÿ��=" + adminType + ", �̸���=" + email + ", ��ȭ��ȣ=" + phone + ", ����� ���̵�=" + regId
				+ ", �����=" + regDate + ", ���� ���̵�=" + modId + ", ������=" + modDate + "]";
	}	
	
}
