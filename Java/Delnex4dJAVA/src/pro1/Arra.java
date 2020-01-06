package pro1;

public class Arra extends Test {

	public Arra() {

	}
	public static void main(String[] args) { 
		//		Arra ar = new Arra();

		int [][] marks = new int [3][];

		marks[0]=new int[50];
		marks[1]=new int[40];
		marks[2]=new int[30];

		int count=0;

		for(int a=0;a<marks.length;a++) {
			for(int b=0;b<marks[a].length;b++) {
				count++;
			}
		}
		System.out.println(count);
	}
}