
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c = 0,temp,n=153,a;
temp=n;
while(n>0){
	a=n%10;
	n=n/10;
	c=c+(a*a*a);
}
if(temp==c)
	System.out.println("amstrng number");
else
	System.out.println("not amstrong number");
	}

}
