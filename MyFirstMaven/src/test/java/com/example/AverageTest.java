package com.example;
import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;
public class AverageTest {
	@Test
	public void std1() {
		Scanner sc = new Scanner(System.in);
		FindAverage f1 = new FindAverage();
		System.out.println("Enter A");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();
		System.out.println("Enter C");
		int c = sc.nextInt();
		assertEquals(45,f1.student(a,b,c));
	}
	@Test
	public void std2() {
		FindAverage f2 = new FindAverage();
		assertEquals(6,f2.student(6,6,6));
	}
}
