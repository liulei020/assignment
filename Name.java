package Regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {

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
			letters += getMatch(s);
		}
		System.out.println("可能合法的姓名  ："+letters);
	}

	private static String getMatch(String s) {
		String regex =  "[A-Z][a-z]+\\s+[A-Z][a-z]*\\s+[A-Z][a-z]+" ;
		String regex2 = "^[A-Z][a-z]+\\s+[A-Z][a-z]*\\s+[A-Z][a-z]+";
		String regex3 = "[A-Z][a-z]+\\s+[A-Z][a-z]*\\s+[A-Z][a-z]+$";
		String regex4 = "[A-Z][a-z]+\\s+[A-Z][a-z]+" ;
		String regex5 = "^[A-Z][a-z]+\\s+[A-Z][a-z]+";
		String regex6=  "[A-Z][a-z]+\\s+[A-Z][a-z]+$";
		String matches = "";
		matches += _findMatch(regex, s);
		matches += _findMatch(regex2, s);
		matches += _findMatch(regex3, s);
		matches += _findMatch(regex4, s);
		matches += _findMatch(regex5, s);
		matches += _findMatch(regex6, s);
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
