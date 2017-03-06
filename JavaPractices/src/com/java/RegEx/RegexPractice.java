package com.java.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
	private String patternString,inputString;
	private String separator="";

	public RegexPractice(String inputString, String patternString) {
		super();
		this.patternString = patternString;
		this.inputString = inputString;
	}
	private String patternRegex(String searchString){
		String pattern="";

		Pattern patterningRegex;
		Matcher patternMatcher;

		return pattern;
	}
	public void isMatchFound(){

		Pattern separatorPattern = Pattern.compile(separator);
		String patternRegex=patternRegex(patternString);

		this.patternString=(patternRegex.equals("")?this.patternString:patternRegex);
		System.out.println(this.inputString);
		System.out.println(this.patternString);
		Pattern pattern = Pattern.compile(this.patternString,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputString);
		
		if(matcher.find()){
			System.out.println(matcher.group());
		}
		/*for(String input:separatorPattern.split(inputString)){
			boolean found = false;

			Matcher matcher = pattern.matcher(input);

			if(matcher.find()){
				input = makeMatchedUpper(input,matcher.start(),matcher.end());
				System.out.println(input);

				found = true;
			}
			if(!found)
				System.out.println("Not found");

		}*/

	}

	private String makeMatchedUpper(String input, int start, int end) {
		// TODO Auto-generated method stub
		String result=null;

		char[] inputSubArray = input.substring(start, end).toCharArray();
		char[] inputArray = input.toCharArray(); 

		for(int i=0,j=start;i<inputSubArray.length && j<end;i++,j++)
			inputArray[j] = Character.toUpperCase(inputSubArray[i]);


		return new String(inputArray);
	}
}
