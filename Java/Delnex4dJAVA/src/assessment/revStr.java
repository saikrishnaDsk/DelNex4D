package assessment;

public class revStr {

	public void revS(String str) {
		String[] w = str.split(" ");
		String  rs= "";
		for (int i=0;i<w.length;i++)
		{
			String w1 = w[i]; 
			String rw = "";
			for (int j = w1.length()-1;j>=0;j--) 
			{
				rw = rw+w1.charAt(j);
			}
			rs = rs+rw+" ";
		}
		System.out.println(rs); 
	}
	public static void main(String[] args) {
		revStr rs = new revStr();
		rs.revS("This is the world of java");
	}
}
