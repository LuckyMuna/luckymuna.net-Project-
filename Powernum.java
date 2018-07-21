import java.util.Scanner;
public class Power {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();

    long r= 1;

    while(b != 0)
    {
        r *= a;
        --b;
    }

    System.out.println(r);

}
}
