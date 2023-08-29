package entity;

public   enum Position {
	Dev(1), Test(2), Scrum_Master(3), PM(4) ;
	
	 private int positionValue;
	 
	 Position (int position) {
		
	 	}
	 public int getPositionValue() {
		 	return positionValue;
	 	}

}
