package pro1;

public class User implements Comparable<User>{
	int uid;
	String uname;
	String email;
	public User(int uid, String uname, String email) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", email=" + email + "]";
	}
	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		return this.uid-u.uid;
	}
}