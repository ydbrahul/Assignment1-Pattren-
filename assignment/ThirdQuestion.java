package assignment;

public class ThirdQuestion {

	public static void main(String[] args) {
		 for(int row=1;row<15;row++) {
			 for(int col=1;col<15;col++) {
				 if(row==1||col==1||row==14||col==14|| row+col<=8||col-row>=6) {
					 System.out.print('*'+" ");
					 
				 }
				 else {
					 System.out.print(' '+" ");
					 
				 }
			 }
			 System.out.print('\n');
		 }

	}

}
