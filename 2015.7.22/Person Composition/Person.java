package Composition;

public class Person {

	private  int hands;
	private int  legs;
	private  Limb handdata;
	private  Limb legdata;

	public Person(int hand,int leg){
		this.hands=hand;
		this.legs=leg;
	}
	public int getHand(){
		return hands;
	}
	public int getLeg(){
		return legs;
	}
	public void printInfo(){
		handdata=new Hands(20,8);
		legdata=new Legs(90,20);
		System.out.println("Hands £º"+getHand());
		System.out.println("Legs £º"+getLeg());
		System.out.println("The length of hand £º"+handdata.getLength()+
				"    The width of hand £º"+handdata.getWidth());
		System.out.println("The length of leg £º"+legdata.getLength()+
				"    The width of leg £º"+legdata.getWidth());
	}
}
