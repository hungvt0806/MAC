package testingSystem_Assignment_1;
import java.time.LocalDate;

public class Account {
	int 			accountId;
	String 			email;
	String 			userName;
	String 			fullName;
	Department 		department;
	Position 		position;
	LocalDate 		createDate;
	Group[]			groups;
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + "]";
	}
	public Account(int accountId, String email, String userName, String fullName, Department department,
			Position position, LocalDate createDate, Group[] groups) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
		this.groups = groups;
	}
	
	
}
