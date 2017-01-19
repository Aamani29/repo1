
public class Factorial2 {
static int Factorial(int n){
	if(n<=1)
		return 1;
	else return(n*Factorial(n-1));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Factorial(5));
	}

}
