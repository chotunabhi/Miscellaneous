package com.java.miscellanoeus;

public class EnumsTest {
	public enum Test{
		ONE(1),
		TWO(2);
		
		private final int i;
		
		private Test(final int i){
			this.i = i;
		}
		
		public int getValue(){
			return this.i;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Test test:Test.values())
			System.out.println(test.name());
//		System.out.println(Test.valueOf("ONE").getValue());
//		checkEnumParam(Test.ONE);
	}
	
	public static void checkEnumParam(Test test){
		System.out.println(test.getValue()+test.name());
	}

}
