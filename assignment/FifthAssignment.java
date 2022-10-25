package assignment;

public class FifthAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<8;row++) {
			for(int col=1;col<15;col++) {
				if(row+col<=8 ||row==1)
					System.out.print('*');
				else System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(int row=1;row<8;row++) {
			for(int col=1;col<15;col++) {
				 if(row==7) {
					 
						 System.out.print('*');
						continue;
					 }
			     else if(col<(row+2)){
					 System.out.print('*');
				 }
			}
			System.out.print("\n");
		}

	}

}
