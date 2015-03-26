public class DrawStars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=0;
 while (row<3){
	 int space=2-row;
	 while(space!=0){
		 System.out.print(" ");
		
		 space--;
	 } int star=(2*row)+1;
	 while (star!=0){
		 System.out.print("*");
		
		 star--;
		 
	 }row++;
	 System.out.println();
	 
	 
 } 
int row2=0;
while(row2<2){
	int spaces=row2+1;
	while(spaces!=0){
		System.out.print(" ");
		spaces--;
	} int stars=3-2*(row2);
	while(stars!=0){
		System.out.print("*");
		stars--;
		
	}row2++;
	System.out.println();
}
	
	}

}
