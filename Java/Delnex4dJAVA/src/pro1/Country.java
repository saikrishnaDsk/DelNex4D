package pro1;

interface PhoneNumber{
	public boolean numberFormat(String number);
}

public class Country{

	public static void main(String[] args) {

		India i = new India();
		System.out.println(i.numberFormat("+91-8888888888"));

		Brazil b = new Brazil();
		System.out.println(b.numberFormat("+55 15 99999-9999"));

		Qatar q = new Qatar();
		System.out.println(q.numberFormat("+974 3399-9999"));

		Turkey t = new Turkey();
		System.out.println(t.numberFormat("+90 509-999999"));
		System.out.println(t.numberFormat("0509-999-999"));

	}
}

class India extends Country implements PhoneNumber{

	public boolean numberFormat(String number) {

		char [] c = number.toCharArray();
		//		int count = number.length();
		if(number.length()==14) {
			if(c[0]=='+' && c[1]=='9' && c[2]=='1' && c[3]=='-'){

				for(int i =4; i<14-4;i++) {
					if(c[i]>='0'|| c[i]<='9' )

						return true;
				}
			}
		}
		return false;
	}
}

class Brazil extends Country implements PhoneNumber{

	public boolean numberFormat(String number) {

		char [] c = number.toCharArray();
		//		int count = number.length();
		if(number.length()==17) {
			if(c[0]=='+' && c[1]=='5' && c[2]=='5' && c[3]==' ' && c[6]==' ' && c[12]=='-'){

				for(int i =4; i<17;i++) {
					if(i==12 || i==6) {
						continue;
					}
					else if(c[i]>='0'|| c[i]<='9' )

						return true;
				}
			}
		}
		return false;
	}
}

class Norway extends Country implements PhoneNumber{

	public boolean numberFormat(String number) {

		char [] c = number.toCharArray();
		//		int count = number.length();
		if(number.length()==15) {
			if(c[0]=='+' && c[1]=='4' && c[2]=='7' && c[3]=='-' && c[6]=='-' && c[9]=='-' && c[12]=='-'){

				for(int i =4; i<15;i++) {
					if(i==9 || i==12 || i==6) {
						continue;
					}
					else if(c[i]>='0'|| c[i]<='9' )

						return true;
				}
			}
		}
		return false;
	}
}

class Qatar extends Country implements PhoneNumber{

	public boolean numberFormat(String number) {

		char [] c = number.toCharArray();
		//		int count = number.length();
		if(number.length()==14) {
			if(c[0]=='+' && c[1]=='9' && c[2]=='7' && c[3]=='4' && c[4]==' ' &&c[9]=='-'){

				for(int i=5; i<14;i++) {
					if(i==9) {
						continue;
					}
					else if(c[i]>='0'|| c[i]<='9' )

						return true;
				}
			}
		}
		return false;
	}
}

class Turkey extends Country implements PhoneNumber{

	public boolean numberFormat(String number) {

		char [] c = number.toCharArray();
		//		int count = number.length();
		if(number.length()==14) {
			if(c[0]=='+' && c[1]=='9' && c[2]=='0' && c[3]==' ' && c[7]=='-'){

				for(int i=4; i<14;i++) {
					if(i==7) {
						continue;
					}
					else if(c[i]>='0'|| c[i]<='9' )

						return true;
				}
			}
		}
		else if(number.length()==12) {
			if(c[0]=='0' && c[1]=='5' && c[2]=='0' && c[4]=='-' && c[8]=='-'){

				for(int i =3; i<12;i++) {
					if(i==4||i==8) {
						continue;
					}
					else if(c[i]>='0'|| c[i]<='9' )

						return true;
				}
			}
		}
		return false;
	}
}



