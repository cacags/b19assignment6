package assignment_6;

public class Question06 {

	public static void main(String[] args) {
		int temp=0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				
				if(j==2) {
					System.out.print(" "+(i+4));
					temp=i+4;
				}
				else if(j==3) {
					System.out.print(" "+(temp+3));
					temp=temp+3;
				}
				else if(j==4) {
					System.out.print(" "+(temp+2));
					temp=temp+2;
				}
				else if(j==5) {
					System.out.print(" "+(temp+1));
					temp=temp+1;
				}
				else 
					System.out.print(i);
				}
			System.out.println();
			}
			

	}

}
