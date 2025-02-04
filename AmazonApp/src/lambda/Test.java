package lambda;

public class Test {

	public static void main(String[] args) {
//		Person p=new Person();
//		p.greet();
		//Greeting g1=new Greeting();
		//anonymous class
//		Greeting g1=new Greeting(){
//			public void greet() {
//				System.out.println("hello");
//				
//			}
//		} ;
//		g1.greet();
//		Greeting g2=new Greeting(){
//			public void greet() {
//				System.out.println("hello");
//				
//			}
//		} ;
		//lambda
		//Greeting g3=()->{System.out.println("hello");};
		//Greeting g3=(n)->{System.out.println("hello "+n);};
		//Greeting g3=(n,f)->{System.out.println("hello "+n+" she is "+y+" years old");};
		Greeting g3=(n,f)->{return "Hello "+n+" "+f;};
		
		System.out.println(g3.greet("Upasana","Dew"));
		
		Cooking c=new Cooking() {
			public void cook() {}
			public void clean() {}
		};
	}

}
//left side => right side
//args => body
//()=>{ ...}
//(x,y)=>{ sout x  sout y}

