public class House {
  private Floor[] floors;
   
  public House(int count ) {
    floors = new Floor[count];
    for(int i = 0;  i< count ; i++) {
        floors[i] = new Floor(i+1);
    }
  }
  public void settle(Owner owner){
      for(Floor floor : floors){
         Appartment appartment  = floor.getFreeAppartment();
         if(appartment != null){
             appartment.addOwner(owner);
             break;
         }
         
     }
  }
  public String toString(){
      String result = "House :  \n";
      for(Floor floor : floors){
          result += floor.toString() + "\n";
      }
      return result;
  }
}//class