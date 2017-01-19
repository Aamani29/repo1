
public class B extends A {
    public B(){
    	super(10);
    	System.out.println("no arg constructor of B");
    }
    public B(int j){
    	
    	System.out.println("parameterised constructor of B"+j);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B d=new B();
   B c=new B(20);
   System.out.println(A.k);
	}

}
