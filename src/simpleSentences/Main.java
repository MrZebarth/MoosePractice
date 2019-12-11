package simpleSentences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//Read in sentence
		String input=in.readLine();
		if (input.length()==0) {
			System.out.println("REJECT");

		}else {
			boolean check=true;
			//check starts with capital
			if (!Character.isUpperCase(input.charAt(0))){
				check=false;
			}
			//Ends in punctuation
			int last=input.length()-1;
			if (input.charAt(last)!='!' && input.charAt(last)!='.' && input.charAt(last)!='?') {
				check=false;
			}
			//Check for only a single punctuation mark
			//Exclamation mark
			if ((input.indexOf('!')!=input.lastIndexOf('!') )|| (input.indexOf('!')!=-1 && input.indexOf('!')!=last)) {
				check=false;
			}
			if ((input.indexOf('.')!=input.lastIndexOf('.') )|| (input.indexOf('.')!=-1 && input.indexOf('.')!=last)) {
				check=false;
			}
			if ((input.indexOf('?')!=input.lastIndexOf('?') )|| (input.indexOf('?')!=-1 && input.indexOf('?')!=last)) {
				check=false;
			}
			//Number of words
			String[] words=input.split(" ");
			if (words.length<3) {
				check=false;
			}
			//length of words
			for (int x=0;x<words.length;x++) {
				if (words[x].length()>34) {
					check=false;
				}
			}
			//Check for final words. Start by capitalizing
			input=input.toUpperCase();
			boolean test=false;
			test=checkWord("I", words)?true:test;
			test=checkWord("HE",words)?true:test;
			test=checkWord("SHE",words)?true:test;
			test=checkWord("THEY",words)?true:test;
			test=checkWord("IT",words)?true:test;
			test=checkWord("THIS",words)?true:test;
			if (test==false) {
				check=false;
			}
			if (check) {
				System.out.println("HOTLINE");
			}else {
				System.out.println("REJECT");
			}

		}
	}

	public static boolean checkWord(String word, String[] sentence) {
		boolean test=false;
		for (int x=0;x<sentence.length;x++) {
			if (sentence[x].equalsIgnoreCase(word)) {
				test=true;
			}
		}
		return test;
	}
}
