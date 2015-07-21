package Regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZipCode {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Users\\H\\Desktop\\12014020\\assignment_4begin" +
				"\\src\\TXT\\input.txt");
		BufferedReader br = new BufferedReader(reader);
		String letters = "";
		while(true){
			String s = br.readLine();
			if (s == null){
				break;
			}
			letters +=getMatch(s);
		}
		System.out.println("属于中国(四级六位制)的邮政编码为   ："+letters);
	}

	private static String getMatch(String s) {
		String regex = "[0-9]{6}";
		String matches = "";
		matches += _findMatch(regex, s);
		return matches;
	}

	private static String _findMatch(String regex, String s) {
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches +="["+m.group(0)+"]  ";
		}
		return matches;
	}

}
