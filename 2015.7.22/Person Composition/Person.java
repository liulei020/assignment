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
		System.out.println("Hands ��"+getHand());
		System.out.println("Legs ��"+getLeg());
		System.out.println("The length of hand ��"+handdata.getLength()+
				"    The width of hand ��"+handdata.getWidth());
		System.out.println("The length of leg ��"+legdata.getLength()+
				"    The width of leg ��"+legdata.getWidth());
	}
}
