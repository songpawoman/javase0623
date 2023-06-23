package com.sp.project0623.animal;

class UseDuck {
	public static void main(String[] args) {
		//오리를 생성한 후, 오리가 직접 보유하고 있지 않은 
		//깃털을 출력해본다  
		Duck d = new Duck();
		System.out.println(d.hasFeather);
	}
}
