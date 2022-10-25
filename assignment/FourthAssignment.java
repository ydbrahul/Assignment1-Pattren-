package assignment;

public class FourthAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<9;row++) {
			for(int col=1;col<15;col++) {
				if(row==8||col<=row|| row+col>=15 ) System.out.print('*'+" ");
				else System.out.print(' '+" ");
			}
			System.out.print('\n');
		}

	}

}
