package net.codejava;



public class User {
	private String Name;
	private String USN;
	private String email;
	private String psw;
	private String repeat;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUSN() {
		return USN;
	}
	public void setUSN(String uSN) {
		USN = uSN;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getRepeat() {
		return repeat;
	}
	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}
	@Override
	public String toString() {
		return "User [Name=" + Name + ", USN=" + USN + ", email=" + email + ", psw=" + psw + ", repeat=" + repeat + "]";
	}
	}


