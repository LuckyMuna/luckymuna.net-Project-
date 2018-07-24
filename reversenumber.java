import java.util.Scanner;
public class string {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
       int a,sum=0;
       a=sc.nextInt();
       int remainder=0;
       while(a!=0){
    	   remainder=a%10;
    	   sum=sum*10+remainder;
    	   a=a/10;
       }
       System.out.println(sum);
       
		

	}

}
