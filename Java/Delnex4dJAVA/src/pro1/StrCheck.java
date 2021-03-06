package pro1;

public class StrCheck {

	public String hasUpper(String data) {

		char [] c = data.toCharArray();

		for(int i=0;i<data.length();i++) {
			if(c[i]>='A' && c[i]<='Z') {
				return "Yes";
			}

		}return "FALSE";

	}
	public String hasNumber(String data) {
		char [] c = data.toCharArray();

		for(int i=0;i<data.length();i++) {
			if(c[i]>=0 && c[i]<=9) {
				return "YES";
			}
		}return "FALSE";
	}
	public boolean CapsOnly(String data) {
		char [] c = data.toCharArray();
		int ctr=0;
		for(int i=0;i<data.length();i++) {
			if(c[i]>='A' && c[i]<='Z')
				ctr++;
		}
		if(ctr==data.length()) {
			return true;
		}
		else
			return false;

	}
	public int countCaps(String data) {
		char [] c = data.toCharArray();
		int ctr=0;
		for(int i=0;i<data.length();i++) {
			if(c[i]>='A' && c[i]<='Z')
				ctr++;
		}
		return ctr;
	}
	public boolean isEqual(char c1,char c2) {

		if(c1==c2) {
			return true; 
		}
		else if((c1>='A' && c1<='Z')||(c2>='A' && c2<='Z')){
			if(c1 == c2-32 || c2==c1-32) {
				return true;
			}
		}
		return false;
	}
	public boolean isEqual(String str1,String str2) {

		if(str1.equalsIgnoreCase(str2)) {
			return true; 
		}
		return false;
	}
	public boolean isDigit (String data) {
		char [] c = data.toCharArray();

		for(int i=0;i<data.length();i++) {
			if(!(c[i]>='0' && c[i]<='9')) {
				return false;
			}

		}
		return true;
	}
	public int digitCount(String data) {
		char [] c = data.toCharArray();
		int count=0;
		for(int i=0;i<data.length();i++) {
			if(c[i]>='0' && c[i]<='9') {
				count++;
			}
		}
		return count;
	}
	public int zeroCount(String data) {
		char [] c = data.toCharArray();
		int count=0;
		for(int i=0;i<data.length();i++) {
			if(c[i]=='0') {
				count++;
			}
		}
		return count;
	}
	public String revStr(String data) {
		char [] c = data.toCharArray();
		char [] r = new char[data.length()];

		for(int i=0,j=data.length()-1;i<data.length();i++,j--) {
			r[j]=c[i];
		}
		for(int p=0;p<data.length();p++) {

			if(r[p]>='A' && r[p]<='Z') {
				r[p]=(char)(r[p]+32);
			}
		}
		for(int i=0;i<data.length();i++) {
			if(c[i]>='A' && c[i]<='Z') {
				r[i]=(char)(r[i]-32);
			}
		}

		String res = new String(r);
		return res;
	}
	public static void main(String[] args) {
		StrCheck sc = new StrCheck();
		System.out.println("HAS UPPER: "+sc.hasUpper("Hello"));
		System.out.println("HAS NUMBER: "+sc.hasNumber("Hello"));
		System.out.println("ONLY CAPS: "+sc.CapsOnly("Hello"));
		System.out.println("COUNT CAPS: "+sc.countCaps("Hello"));
		System.out.println("IS CHAR EQUAL: "+sc.isEqual("C","c"));
		System.out.println("IS STRING EQUAL: "+sc.isEqual("HELLO","Hello"));
		System.out.println("IS DIGIT: "+sc.isDigit("1235"));
		System.out.println("DIGIT COUNT: "+sc.digitCount("Hell231o"));
		System.out.println("ZERO COUNT: "+sc.zeroCount("130000"));
		System.out.println("Reverse Lower: "+sc.revStr("HelloWorld"));
	}
}
