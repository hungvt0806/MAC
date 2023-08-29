package entity;

public class user {
	private  	int    	id ;
	private    	String 	fullname;
	private    	String 	email;
	private    	String 	password;
	private    	int 	project_id ;
	private    	int 	exp_in_year;
	private    	String 	pro_skill ;
	private     String  role;
	
	
	@Override
	public String toString() {
		return "user [fullname=" + fullname + ", project_id=" + project_id + ", role=" + role + "]";
	}
	
	
	
	public user(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public user(String fullname, int project_id, String role) {
		super();
		this.fullname = fullname;
		this.project_id = project_id;
		this.role = role;
	}


	public user(String fullname, int project_id) {
		super();
		this.fullname = fullname;
		this.project_id = project_id;
	}
	public user(int project_id) {
		super();
		this.project_id = project_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getExp_in_year() {
		return exp_in_year;
	}
	public void setExp_in_year(int exp_in_year) {
		this.exp_in_year = exp_in_year;
	}
	public String getPro_skill() {
		return pro_skill;
	}
	public void setPro_skill(String pro_skill) {
		this.pro_skill = pro_skill;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
