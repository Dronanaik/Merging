package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(101, "Uppu");
		map.put(102, "Virat");
		map.put(103, "tikku");
		map.put(102, "Sharma");
		map.put(104, "Dev");
		map.put(105, "Kohli");

		System.out.println(map.get(101));
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue());
			System.out.println(m.getKey());
		}

	}

}
