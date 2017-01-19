
public class initialization {
    static int a=10; 
    static String name="abc";
    static{
    	System.out.println("static block");
    }
    {
    	System.out.println("Instance block1");
    }
    public initialization(){
      	System.out.println("constructor");
    }
    public initialization(int i){
    	this();
    	
      	System.out.println("param constructor");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   initialization init=new initialization();
   System.out.println(init.initialization(10));
   System.out.println(a);
   System.out.println(name);
   
   
	}

	

}
