package entity;
import java.time.LocalDate;

public class GroupAccount {
	public Group				groupId;
	public int 				accountId;
	public LocalDate 		joinDate;
	
	
	
	public GroupAccount() {
		super();
	}



	public GroupAccount(Group groupId, int accountId, LocalDate joinDate) {
		super();
		this.groupId = groupId;
		this.accountId = accountId;
		this.joinDate = joinDate;
	}



	public Group getGroupId() {
		return groupId;
	}



	public void setGroupId(Group groupId) {
		this.groupId = groupId;
	}



	public int getAccountId() {
		return accountId;
	}



	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}



	public LocalDate getJoinDate() {
		return joinDate;
	}



	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	
	
	
	
}
