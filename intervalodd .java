import java.util.Scanner;
public class palindrome {
	public static void main(String[]args){
int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
System.out.println("The Odd Numbers are:");
for (int i =a; i <= b; i++) {
	if (i % 2 != 0) {
		System.out.print(i + " ");
	}
}
}
