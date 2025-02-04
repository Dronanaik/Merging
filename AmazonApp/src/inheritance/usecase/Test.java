package inheritance.usecase;

public class Test {

	public static void main(String[] args) {
		Liquid l=new Liquid();
		Milk m=new Milk();
		Coffee c=new Coffee();
		Tea t=new Tea();
		Mug mm=new Mug();
		Juice j=new Juice();
		mm.addLiquid(l);
		mm.addLiquid(m);
		mm.addLiquid(t);
		mm.addLiquid(c);
		mm.addLiquid(l);
		
		Liquid ll1=new Milk();
		Liquid ll2=new Coffee();
		Liquid ll3=new Tea();

	}

}
