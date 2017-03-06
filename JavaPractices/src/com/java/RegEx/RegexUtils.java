package com.java.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {
	private static String pattern="";
	private static String replacingExpression="";
	private static Pattern patterningRegex;
	private static Matcher patternMatcher;

	public static String exactWordPattern(String searchString) {
		pattern = searchString;

		//for exact word or Phrase match
		String exactWordregex="\\\"\\w*(\\s*)\\w*\\\"";

		patterningRegex = Pattern.compile(exactWordregex);
		patternMatcher = patterningRegex.matcher(searchString);

		if(patternMatcher.find()){
			replacingExpression = "";
			pattern = "(\\W|^)"+searchString.replaceAll("\"", replacingExpression)+"(\\W|$)";
		}

		return pattern;
	}
	public static String andRegexPattern(String searchString) {
		pattern = searchString;

		//AND between two words
		String andRegex="\\w+(\\s([Aa][Nn][Dd])\\s)\\w+";
		patterningRegex = Pattern.compile(andRegex);
		patternMatcher = patterningRegex.matcher(searchString);
		String[] searchWords = searchString.split("([Aa][Nn][Dd])");

		if(patternMatcher.find()){
			replacingExpression = "(\\w|\\s)*";
			pattern = "("+searchWords[0].trim()+replacingExpression+searchWords[1].trim()+")";
			pattern += "|("+searchWords[1].trim()+replacingExpression+searchWords[0].trim()+")";
			System.out.println(pattern);
		}

		return pattern;
	}
	public static String orRegexPattern(String searchString) {
		pattern = searchString;

		//OR between two words
		String orRegex="\\w+(\\s([Oo][rR])\\s|,|\\s+)\\w+";
		patterningRegex = Pattern.compile(orRegex);
		patternMatcher = patterningRegex.matcher(searchString);

		if(patternMatcher.find()){
			replacingExpression = "|";
			pattern = ""+searchString.replaceFirst("((\\s([Oo][Rr])\\s)|,|\\s+)", replacingExpression)+"";
		}

		return pattern;
	}
}
