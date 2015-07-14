package Fib;

import java.util.Scanner;

public class Fib {
    int n;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
	    System.out.println("Please input this fibonacci n:");  
	    int n = scanner.nextInt();
	    if(n<0){
	    	System.out.println("error!!");
	    	System.out.println("Please input this fibonacci new n:");
	    	int newn = scanner.nextInt();
	    	new Fib(newn); 	
	    }else{
	    	new Fib(n);
	    }
	}
	public Fib(int n){
		int[] Fib=new int[n];
        Fib[0]=0;
        Fib[1]=1;
        for(int i=2;i<Fib.length;i++){
      	Fib[i]=Fib[i-2]+Fib[i-1];
        }
        for(int i=0;i<Fib.length;i++){
      	System.out.print(Fib[i]+"\t");
        }
	 }	
}


