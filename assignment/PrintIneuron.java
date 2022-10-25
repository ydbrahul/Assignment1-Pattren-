package assignment;

public class PrintIneuron {

	public static void main(String[] args) {
		 //for printing 'I'
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=50;col++) {
				if(col==2|| col==5 || col==9||row+4==col|| col==12|| (row==1||row==3||row==5) && (col==13||col==14||col==15) ||col==18||col==22||row==5&& (col>18 && col<22)|| col==25||(row==1||row==3) &&(col>25&&col<29)||(col==28&& row<4)||(row==4&&col==26)||(row==5&&col==27)||col==31&&(row>1&&row<5)||col==35&&(row>1&&row<5)||(row==1||row==5)&&(col>31&&col<35)|| col==38||col==42||row+37==col) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.print('\n');
		 
		}
		 
		

	}

}
