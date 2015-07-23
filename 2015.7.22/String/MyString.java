package String;

public class MyString {

	private char[] ch;

	public MyString(String str){
		this.ch=str.toCharArray();
	}

	public int length(){
		int cnt=0;
		for(char c:ch){
			if(c!=('\0')) cnt++;
			else break;
		}
		return cnt;
	}

	public void reverse(){
		char[] a=new char[this.length()];
		for(int i=this.length()-1;i>=0;i--){
			a[this.length()-1-i]=ch[i];
		}
		this.ch=a; 
	}

	public void concat(MyString x){
		String ss=this.toValue()+x.toValue();
		this.ch=ss.toCharArray();
	}

	public void lower(){
		for(int i=0;i<this.length();i++){
			if(ch[i]>64&&ch[i]<91) ch[i]+=32;
			else if(ch[i]>96&&ch[i]<123) continue;
			else break;
		}
	}

	public void upper(){
		for(int i=0;i<this.length();i++){
			if(ch[i]>64&&ch[i]<91) continue;
			else if(ch[i]>96&&ch[i]<123) ch[i]-=32;
			else break;
		}
	}

	public String toValue(){
		String s="";
		for(char c:ch){
			s+=c;
		}
		return s;
	}

	public static void main(String[] args) {
		MyString x = new MyString("abc");
		System.out.println(x.toValue()); // 输出abc
		System.out.println(x.length());  //输出3
		x.reverse();
		System.out.println(x.toValue()); // 输出cba
		x.upper();
		System.out.println(x.toValue()); // 输出CBA
		x.reverse();
		System.out.println(x.toValue()); // 输出ABC
		x.lower();
		System.out.println(x.toValue()); // 输出abc
		MyString y = new MyString("xyz");
		x.concat(y);
		System.out.println(x.toValue()); // 输出abcxyz
		System.out.println(x.length());  //输出6

	}

}
