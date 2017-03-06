package com.java.utilPacks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListManips {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("IDMSList\\DevUserIdList1"));
		String data = null;
		Set<Integer> oldUsersList = new LinkedHashSet<Integer>();
		
		while((data = br.readLine()) != null)
			oldUsersList.add(Integer.parseInt(data));
		
		br = new BufferedReader(new FileReader("IDMSList\\DevUserIdList2"));		
		Set<Integer> newUsersList = new LinkedHashSet<Integer>();
		while((data = br.readLine()) != null)
			newUsersList.add(Integer.parseInt(data));
		
		Set<Integer> tempSet = new HashSet<Integer>(oldUsersList);
		
		oldUsersList.removeAll(newUsersList);
		System.out.println("Lost Users :"+ oldUsersList);
		newUsersList.removeAll(tempSet);
		System.out.println("New Users :"+ newUsersList);
		
	}

}
