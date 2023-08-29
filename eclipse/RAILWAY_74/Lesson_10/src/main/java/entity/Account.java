package entity;
import java.time.LocalDate;



public class Account {
	private  int 			accountId;
	private  String 		email;
	private  String 		userName;
	private  String 		fullName;
	private  Department 	departmentId;
	private  Position 		positionId;
	private  LocalDate 		createDate;
	private  Group[]		groups;
	  
	
	@Override
	public String toString() {
		return "Account [positionId=" + positionId + ", accountId=" + accountId + ", fullname=" + fullName + "]";
	}

	
	public Account() {
		super();
	}


	public Account( String email, String userName, String fullName
		, Department departmentId,Position positionId, LocalDate createDate) {
		super();
	
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.departmentId = departmentId;
		this.positionId = positionId;
		this.createDate = createDate;
	
	}


	public Account(int accountId, String fullName, Position positionId) {
		super();
		this.accountId = accountId;
		this.fullName = fullName;
		this.positionId = positionId;
	}

	

	public Account(Department departmentId) {
		super();
		this.departmentId = departmentId;
	}


	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Department getDepId() {
		return departmentId;
	}


	public void setDepId(Department departmentId) {
		this.departmentId = departmentId;
	}


	public Position getPositionId() {
		return positionId;
	}


	public void setPositionId(Position positionId) {
		this.positionId = positionId;
	}


	public LocalDate getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}


	public Group[] getGroups() {
		return groups;
	}


	public void setGroups(Group[] groups) {
		this.groups = groups;
	}


	





	

	
}
