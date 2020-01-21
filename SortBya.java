package Robomq;

import java.util.Comparator;

public class SortBya implements Comparator<Book>{

	@Override
	public int compare(Book p1, Book p2) {
		String name1=p1.getName();
		String name2=p2.getName();
		int r=name1.compareTo(name2);
		return r;
	}
}
