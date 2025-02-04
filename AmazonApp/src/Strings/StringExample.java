package Strings;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String temp = "My Name is Drona";
//		String[] name = {"Drona","Pandya","Hardik","Rahul Dravid"};
//		System.out.println(temp.length());
//		System.out.println(temp.substring(5));
//		System.out.println(temp.substring(2,9));
//		System.out.println(temp.charAt(4));
//		System.out.println(temp.startsWith("M"));
//		System.out.println(temp.replace("D", "P"));
//		System.out.println(temp.replaceAll(temp, "KPMG"));
//		System.out.println(temp.compareTo("KPMG"));
//		System.out.println(String.join(" ", name));
//		System.out.println(temp.endsWith("a"));
		
		
		
		String name = "Upasana";
		name = "Hello " + name;
		name += " How are you";
		System.out.println(name);
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		sb.append("Drona");
		sb.append(" Nakkan meri yest dina merithiya");
		sb.insert(0, "Namskara ");
		System.out.println(sb);
}
}