import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number(Factorial) : ");
        int n=Integer.parseInt(sc.nextLine());
		int fact=1;
	
		for(int i=n;i>0;i--)
		{
	    fact=fact*i;
	    
		}
		System.out.println("Factorial is : "+fact);
	}

}
