package entity;
import java.time.LocalDate;

public class Group {
	public int 				id;
	public String 			name;
	public int				creatorId;
	public LocalDate		createDate;

	public Group(int id, String name, int creatorId, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		this.creatorId = creatorId;
		this.createDate = createDate;
	}
	
	
	
	

}
