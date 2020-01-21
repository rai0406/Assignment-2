package Robomq;

import java.util.Comparator;

public class SortByid implements Comparator<Book>{

	@Override
	public int compare(Book p1, Book p2) {
		int name1=p1.getId();
		int name2=p2.getId();
		int r=name1-name2;
		return r;
	}
}
