package pro1;

public class Test {

	public void hello() {
		System.out.println("Method Called");
	}
	public Test() {
		System.out.println("Default Const called");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.hello();
		
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb1 = new StringBuilder("Hello");
//		sb.append("World");
		
		if(sb.equals(sb1)) {
			System.out.println("Equal");
			
		}
		else {
			System.out.println("NOT EQUAL");
		}
		
}
}