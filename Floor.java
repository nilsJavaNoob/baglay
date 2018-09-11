public class Floor {
	 private int number;
	 private Appartment [] appartments;
	 
	public Floor(int number,  int appartmCount){
		this.number = number;
		this.appartments = new Appartment[appartmCount];
		for(int i = 0;  i< appartmCount;  i++){
			appartments[i] = new Appartment();
		}
	}
	 public Appartment getFreeAppartment(){
		return null;
	}
	public String toString(){
		String result="=========================\n";
		 result +="Floor : " + number + "\n " ;
		result+="----------------------------------------\n";
		for(Appartment appartment : appartments){
			result += appartment.toString() + "\n";
		}
		result+="=========================\n";
		return result;
	}
}//class