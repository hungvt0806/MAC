package entity;
import java.time.LocalDate;

public class GroupAccount {
	public int 				id;
	public Account 			accountId;
	public LocalDate 		joinDate;
	
	public GroupAccount(int id, Account accountId, LocalDate joinDate) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.joinDate = joinDate;
	}
	
	
}
