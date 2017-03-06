package com.java.miscellanoeus;

public class EnumTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TYPELIMIT tl = TYPELIMIT.valueOf("thokka");
//		System.out.println(.getLimit());
	}
	
	enum ContainerType{
		CIQ_SHARED_ROOT(8),
		COMPANY_SHARED_ROOT(10),
		SHARE_ROOT(11),
		MY_MONITOR(12);
		
		ContainerType(int i){
			
		}
	}
	enum TYPELIMIT{
		CIQ_SHARED_ROOT(8,500),
		COMPANY_SHARED_ROOT(10,500),
		SHARED_ROOT(11,100),
		ADMIN(15,1000),
		MY_MONITOR(12,100)
		;

		private int typeId;
		private int limit;

		TYPELIMIT(int typeId,int limit){
			this.typeId = typeId;
			this.limit = limit;
		}

		public int getTypeId() {
			return typeId;
		}
		public int getLimit() {
			return limit;
		}
	}

}
