package kr.jaen.java.custom;
class ValueExcept extends Exception
{                               
	ValueExcept(){
		super("ValueException:���� ���� ���� �� �����ϴ�.");
	}
	void myMethod(){
		System.out.println("Exception ó�� ����...");
	}
}
