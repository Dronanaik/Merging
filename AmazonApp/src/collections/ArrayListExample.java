package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		//List list=new ArrayList();
		list.add("uppu");
		list.add(1234);
		list.add(12.56f);
		list.add('Y');
		list.add(true);
		
		
		System.out.println(list);
		ArrayList<String> list1=new ArrayList(3);
		//List list=new ArrayList();
		list1.add("uppu");
		list1.add("Arjun");
		list1.add("Prerak");
		list1.add("Mrinal");
		list1.add(1,"Leela");		
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(list1);
		Book b1=new Book("aaa",12,"aaa");
		Book b2=new Book("bbb",13,"bb");
		Book b3=new Book("ccc",14,"cc");
		Book b4=new Book("ddd",11,"ddd");
		Book b5=new Book("eee",15,"eee");
		ArrayList<Book> bookList=new ArrayList();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		System.out.println(bookList);
		Iterator<Book> itrB=bookList.iterator();
		while(itrB.hasNext())
		{
			Book temp=itrB.next();
			if(temp.price>12)
			System.out.println(temp);
		}

	}

}













