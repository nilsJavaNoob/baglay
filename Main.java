//import House
public class Main{
	public static void main(String[] args){
		System.out.println("Hi!!");
		 House house = new House(16);
		 Owner owner1 = new Owner("Stiven.Stine");
		//Owner owner2 = new Owner("Helen.Stine");
		house.settle(owner1);
		//house.settle(owner2);
		System.out.println(house.toString());
		//System.out.println(owner1.toString());
			
	}
	
} 