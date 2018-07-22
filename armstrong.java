import java.util.Scanner;
public class palindrome {
	public static void main(String[]args){
		
		 Scanner in = new Scanner(System.in);
		 int r,r1,r2,sum=0,temp = 0;
				 sum=temp;
	     int a=in.nextInt();
	     int b;
	     int c;
	     int d;
	     while(a!=0){
	    	r=a%10;
	    	 a=a/10;
	   sum=sum+(a*a*a);
	    	 }
	  
	     
	     if(temp==a){
	    	 System.out.println("yes");
	     }
	     else{
	    	 System.out.println("no");
	     }
	}
}
