package kr.jaen.java.excep;
public class ExcepTest{
	public static void main(String[] args) {
		ExcepTest et= new ExcepTest();
		et.pr();
		System.out.println("main End..�̰� �� �����ؾ� �ϴµ�...");
	}

	void pr(){
		int i = 0;
		String greetings[] = {"Good Bye",
							  "Hi~",
							  "�ȳ���~"};
		try{
			while (i < 4) {
				System.out.println(greetings[i]);
				i++;
			}
		}catch(Exception e){
			System.out.println("Error :"+e);
		}
		System.out.println("Method End.."+i);
	}
}
