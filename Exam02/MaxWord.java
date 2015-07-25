package Exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class MaxWord {
	private static String[] ch ={"am","is","are","was","been","has","have",
		"had","a","an","the","in","at","on","to","or"};;
	private static String[] fetch;
	ArrayList<Integer> count;
	ArrayList<String> mid;
	ArrayList<String> other;
	public static void main(String[] args){
		File file=new File("C:\\Users\\H\\Desktop\\12014020\\Exam\\src\\" +
				"Exam02\\English Test.txt");
		 //System.out.println(readToString(file));
		 String rec=readToString(file);
		 String str=rec.replaceAll("[\\pP‘’“”]", "");
		 fetch=str.split("\\s");
		 MaxWord m=new MaxWord();
		 System.out.println(m.getOtherWord());
		 //System.out.println(m.checkWord());
		 /**for(String x: fetch){
			 System.out.println(x);
		 }*/
	}
	public ArrayList<String> getOtherWord(){
		String[] midd=new String[2048];
		other=new ArrayList<String>();//除指定单词外文章出现的单词
		mid=new ArrayList<String>();//先文章全部单词，处理后为除指定单词外文章出现的单词（含重复单词）
		for(String n:fetch){	
			mid.add(n);
		}
		for(String x:fetch){
			for(String y:ch){
				if(x.equals(y)){
					mid.remove(x);
				}
			}
		}
		for(int i=0;i<mid.size();i++){
			midd[i]=mid.get(i);
		}
		for(int j=0;j<mid.size();j++){
			for(String k:midd){
				if(k.equals(mid.get(j))){
					other.add(mid.get(j));
					mid.remove(j);
				}
			}
		}
		return other;
		
	}
	public ArrayList<Integer> checkSpecifiedWord(){
		 int num=0;
		 count=new ArrayList<Integer>();
		//遍历文章
		 for(int i=0;i<16;i++){
			 //System.out.println("外单词数组 ："+ch[i]);
			//遍历数组
			for(String t: fetch){
				//System.out.println("内单词数组 ："+ch[i]);
				//System.out.println("内部循环t ："+t);
				if(t.equals(ch[i])){
					num++;
				}
			}
			count.add(num);
			//System.out.println("内部计数数组 ："+count);
		}
		return count;
	}

	private static String readToString(File file) {
		Long filelength = file.length();    
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  new String(filecontent);
	}

}
