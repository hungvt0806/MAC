package entity;
import java.time.LocalDate;

public class Group {
	public int 				id;
	public String 			name;
	public int				creatorId;
	public LocalDate		createDate;
	
	

	public Group() {
		super();
	}



	public Group(int id, String name, int creatorId, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		this.creatorId = creatorId;
		this.createDate = createDate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCreatorId() {
		return creatorId;
	}



	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}



	public LocalDate getCreateDate() {
		return createDate;
	}



	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	
	
	

}
