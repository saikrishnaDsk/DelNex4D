package pro1;

public class StrReplace {
	String myreplace(String val,char old,char ne) {
		
		char [] c = val.toCharArray();
		
		for(int i=0;i<val.length();i++) {
			
			if(old==c[i]) {
				c[i]=ne;
			}
		}
		String res = new String(c);
		return res;
	}
	public String replacefirst(String val,char old,char ne) {
		
		char [] c = val.toCharArray();
		
		for(int i=0;i<val.length();i++) {
			
			if(old==c[i]) {
				c[i]=ne;
				break;
			}
		}
		String res = new String(c);
		return res;
		
	}
	public String replacelast(String val,char old,char ne) {
		char [] c = val.toCharArray();
		
		for(int i=val.length()-1;i>=0;i--) {
			
			if(old==c[i]) {
				c[i]=ne;
				break;
			}
		}
		String res = new String(c);
		return res;
	}
	
	public static void main(String[] args) {
		StrReplace sr = new StrReplace();
		
		System.out.println(sr.myreplace("hello",'l','k'));
		System.out.println(sr.replacefirst("hello",'l','k'));
		System.out.println(sr.replacelast("hello",'l','k'));
	}
}
