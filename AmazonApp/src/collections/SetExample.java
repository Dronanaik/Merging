package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set=new HashSet();
		set.add("uppu");
		set.add("Appu");
		set.add("Tipu");
		set.add("Dinku");
		set.add("Pappu");
		set.add("Dinku");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		Set<String> set1=new TreeSet();
		set1.add("uppu");
		set1.add("Appu");
		set1.add("Tipu");
		set1.add("Dinku");
		set1.add("Pappu");
		set1.add("Dinku");
		System.out.println(set1);

	}

}
