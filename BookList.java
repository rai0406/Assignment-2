package Robomq;

import java.util.*;

public class BookList {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
ArrayList<Book> obj=new ArrayList<Book>();
		
		obj.add(new Book(1,"a","f"));
		obj.add(new Book(3,"b","g"));
		obj.add(new Book(2,"c","h"));
		obj.add(new Book(5,"d","i"));
		obj.add(new Book(4,"e","j"));
		
		System.out.println(obj);
		
		System.out.println("1:id......2:name......3:author");
		int ch=sc.nextInt();
		
		if(ch==2)
		{
			System.out.println("Sorted By Book name \n");
			SortBybn n=new SortBybn();
			obj.sort(n);
			System.out.println(obj);
		}
		
		if(ch==1)
		{
			System.out.println("Sorted By Id \n");
			SortByid m=new SortByid();
			obj.sort(m);
			System.out.println(obj);
		}
		
		if(ch==3)
		{
			System.out.println("Sorted By Author name \n");
			SortBya o=new SortBya();
			obj.sort(o);
			System.out.println(obj);
		}
				

	}

}
