
public class A {
	static int k=5;
	int l=20;
	public A(){
		
	System.out.println("no arg constructor of A");
	}
    public A(int i){
    	
    	
	System.out.println("parameterised constructor of A"+i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A b = new A(10);
     System.out.println(k);
	}

}
