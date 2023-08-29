package entity;

public   class Position {
	int  		psId;
	String 		positionName;
	@Override
	public String toString() {
		return "Position [positionId=" + psId + ", positionName=" + positionName + "]";
	}
	
	public Position(int psId) {
		super();
		this.psId = psId;
	}

	public Position(int psId, String positionName) {
		super();
		this.psId = psId;
		this.positionName = positionName;
	}
	public int getPsId() {
		return psId;
	}
	public void setPsId(int psId) {
		this.psId = psId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	

	
}
