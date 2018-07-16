import java.util.Scanner;
public class countnumb {
	public static void main(String[]args){
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			while(n!=0){
				n=n/10;
			count++;	
		}
		}
		System.out.println(count);
	}

}
