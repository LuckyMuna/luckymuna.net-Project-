import java.util.Scanner;
public class string {
	public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int b[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		String c[]={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
		int i=0;
		for(i=0;i<10;i++){
			if(a.equals(c[i])){
				System.out.println(b[i]);
	}

}
	}
}
