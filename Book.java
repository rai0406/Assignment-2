package Robomq;

public class Book {

	private int id;
	private String name;
	private String author;
	
	public Book(int id,String name,String author)
	{
		this.id=id;
		this.name=name;
		this.author=author;
	}
	public int getId() //getter for private property
	{
		return id;
	}
	public void setId(int id)//setter for private property
	{
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public String toString()
	{
		return "\nBook Id : "+id+" Book Name : "+name+" Author : "+author;
	}
}
