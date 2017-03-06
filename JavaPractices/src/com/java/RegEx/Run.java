package com.java.RegEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class Run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Regular Expression:");
//		String pattern = "(?-i)\\A(((?i)(corp|inc|llc|pte|ltd|co|st|pty|www|etc|p\\.l\\.)\\.)|(((\\A|[\\s\\.])[A-Z])+\\.)|(\\.((?i)com|org|net|gov|edu))|%\\)\\.|([^\\.]))+(\\.|\\Z)";
				//br.readLine();
		Pattern escapeChars = Pattern.compile("^(\\*|[\\w])*[\\^][\\w]*[\\*]*$");
		Pattern replaceChars = Pattern.compile("\\^");
		Pattern stripChars = Pattern.compile("[:]");
		
		String keyword = "*^comp*";
		StringBuffer sb = new StringBuffer();
		if (escapeChars.matcher(keyword).matches()){
//			replaceChars.
			sb.append(replaceChars.matcher(stripChars.matcher(keyword).replaceAll(" ").trim()).replaceFirst("\\\\"));
			System.out.println("Ok"+sb);
		}
		else
			System.out.println("NOK"+stripChars.matcher(keyword).replaceAll(" ").trim());
			
//		String pattern = "NEWS.ACQUIREMEDIA.NEWSTORY.DELAYED.60";
		
//		System.out.println("Enter Input Strings followed by ',':");
//		String input ="Tetraphase Pharmaceuticals, Inc., a clinical stage biopharmaceutical company, develops various antibiotics for the treatment of serious and life-threatening multi-drug resistant infections. Its lead product candidate is eravacycline, an intravenous and oral antibiotic for use as a first-line empiric monotherapy for the treatment of multidrug-resistant infections, including multidrug-resistant Gram-negative bacteria. The company is conducting a Phase III clinical trial of eravacycline with intravenous administration for the treatment of complicated intra-abdominal infections; and a second Phase III clinical trial of eravacycline for the treatment of complicated urinary tract infections with intravenous-to-oral step-down therapy. It is also developing TP-271, a preclinical compound for respiratory diseases caused by bacterial biothreat pathogens; and preclinical Gram-negative program for multidrug-resistant Gram-negative infections. The company was founded in 2006 and is headquartered in Watertown, Massachusetts.";
		String input = "12.NEWS.ACQUIREMEDIA.NEWSTORY.DELAYED.60";
//		Pattern patternReg = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
//		java.util.regex.Matcher matcher = patternReg.matcher(input);
//		if(matcher.find())
//		System.out.println(matcher.group(0));
		
		
		/*RegexPractice rp = new RegexPractice(input, pattern);
		rp.isMatchFound();
		
		input = "Agasti Holding ASA provides investment advice, and management and capital market services for wealthy individuals, companies, and institutional investors in Norway and Sweden. The company operates through Wealth Management, Markets, and Other segments. It offers investment advice based on an individually tailored investment profile, as well as provision of Norwegian and international equity and fixed income funds; and enables customers to invest in alternative products, such as investment portfolios within real estate, shipping, private equity, and infrastructure. The company also offers capital market services comprising advice and facilitation for various capital market transactions; assists in financing, mergers, acquisitions, restructuring, etc.; investment management services, including asset management, IR services, and other business services; and insurance products. It has strategic alliance with Wunderlich Investment Company. Agasti Holding ASA was founded in 1990 and is headquartered in Oslo, Norway.";
		rp = new RegexPractice(input, pattern);
		rp.isMatchFound();
		*/
		
	}

}
