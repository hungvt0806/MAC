package testingSystem_Assignment_1;
import java.time.LocalDate;

public class GroupAccount {
		int 			id;
		Account 		accountId;
		LocalDate 		joinDate;
		public GroupAccount(int id, Account accountId, LocalDate joinDate) {
			super();
			this.id = id;
			this.accountId = accountId;
			this.joinDate = joinDate;
		}
		
		
}
