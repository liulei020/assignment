package Regex;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LINK {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Users\\H\\Desktop\\12014020\\assignment_4begin" +
				"\\src\\TXT\\SourceCode.txt");
		BufferedReader br = new BufferedReader(reader);
		String letters = "";
		while(true){
			String s = br.readLine();
			if (s == null){
				break;
			}
			letters += getMatch(s);
		}
		System.out.println(letters);
	}

	private static String getMatch(String s) {
		String regex = "(http|https){1}\\:\\//(\\s*|\\S*)\"";
		String regex2 = "^(http|https){1}\\:\\//(\\s*|\\S*)\"";
		String regex3 = "(http|https){1}\\:\\//(\\s*|\\S*)\"$";
		String matches = "";
		matches += _findMatch(regex, s);
		matches += _findMatch(regex2, s);
		matches += _findMatch(regex3, s);
		return matches;
	}

	private static String _findMatch(String regex, String s){
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches +="["+ m.group(0)+"]  ";
		}
		return matches;
	}

}

