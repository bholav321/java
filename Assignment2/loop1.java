import java.util.Scanner;
	
class Test{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer value");
	int n = sc.nextInt();
	int rev = 0;
	while(n>0){
	int rem = n%10;
	n = n/10;
	rev = 10*rev+rem;
	}
	System.out.println("Reverse Digite= "+rev);
  }

}