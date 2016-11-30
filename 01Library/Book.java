public class Book{
    private String author;
    private String title;
    private String ISBN;
    Book(){
	author="some author";
	title="some title";
	ISBN="some number";
	System.out.println("pls provide real info");
    }
    Book(String person, String book, String num){
	author=person;
	title=book;
	ISBN=num;
    }
    public String getAuthor(){
	return author;
    }
    public String getTitle(){
	return title;
    }
    public String getISBN(){
	return ISBN;
    }
    public void setAuthor(String name){
	author=name;
    }
    public void setTitle(String name){
	title=name;
    }
    public void setISBN(String num){
	ISBN=num;
    }
    public String toString(){
	String ans="";
	ans+="The book, "+ title + ", is by " + author + ", and has an ISBN of " + ISBN;
	return ans;
    }

    public static void main(String[]args){
	Book me=new Book();
	Book ya=new Book("Shakespeare","Hamlet","182829303-292929");
	System.out.println(me.toString());
	me.setTitle("Catcher in the Rye");
	System.out.println(me.toString());
	System.out.println(ya.toString());
    }
	
}
