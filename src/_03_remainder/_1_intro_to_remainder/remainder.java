package _03_remainder._1_intro_to_remainder;

public class remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("1");
		for(int loop=2; loop<21; loop++) {
			if(loop %3 == 0 && loop % 5 == 0 ){
				System.out.print(", fizzbuzz");
			}
			else if(loop % 3 == 0){
				System.out.print(", fizz");
			}
			else if(loop % 5 ==0) {
				System.out.print(", buzz");	
			}
			else{
				System.out.print(", " + loop);
			}
			
			
		}
		
		
	}
	
	

}
