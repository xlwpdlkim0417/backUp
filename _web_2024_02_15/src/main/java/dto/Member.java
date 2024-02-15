package dto;

public class Member {

	private String id;
	private String email;
	private String name;
	private int residentnum;
	private int phone;

	public Member() {
		super();
	}

	public Member(String id, String email, String name, int residentnum, int phone) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.residentnum = residentnum;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResidentnum() {
		return residentnum;
	}

	public void setResidentnum(int residentnum) {
		this.residentnum = residentnum;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", email=" + email + ", name=" + name + ", residentnum=" + residentnum + ", phone="
				+ phone + "]";
	}

}
