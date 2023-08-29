package entity;
import java.time.LocalDate;

public class GroupAccount {
	public int 				groupId;
	public int 				accountId;
	public LocalDate 		joinDate;
	
	public GroupAccount(int groupId, int accountId, LocalDate joinDate) {
		super();
		this.groupId = groupId;
		this.accountId = accountId;
		this.joinDate = joinDate;
	}
	
	
}
