package kr.jaen.java.custom;
class MyExcept extends Exception
{                               
	MyExcept(){
		super("����ڰ� ����  Exception class");
	}
	void myMethod(){
		System.out.println("Exception ó�� ����...");
	}
}
