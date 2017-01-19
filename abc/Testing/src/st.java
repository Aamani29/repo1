
public class st {
	int x = 10;
	static int i = 10;
	static String name = "String";

	st() {

	}

	st(int i) {

	}
	public void add(){
		
	}

	/*
	 * static{ i=30; System.out.println("static block"); } { System.out.println(
	 * "initialization block"); } public st(){
	 * 
	 * System.out.println("default constructor"); } public st(int i){
	 * System.out.println("param constructor"); }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		st s = new st();
		s.x += 10;
		System.out.println(s.x);
		s = new st(0);
		System.out.println(s.x);

	}

}
