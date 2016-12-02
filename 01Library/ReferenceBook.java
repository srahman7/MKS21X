public class ReferenceBook extends LibraryBook{
    private String collection;
    public ReferenceBook(String person, String name, String ID, String num, String e){
	super(person, name, ID, num);
	collection=e;
    }
    public void checkout(String patron, String due){
	System.out.println("Cannot checkout a reference book.");
    }
    public void returned(){
	System.out.println("reference book could not have been checked out");
    }
    public String circulationStatus(){
	String ans="non-circulating reference book";
	return ans;
    }
    public String toString(){
	String ans=" and it's collection is "+ collection;
	return super.toString() + ans;
    }
    public static void main(String[]args){
	ReferenceBook a= new ReferenceBook("a","b","c","d","e");
	System.out.println(a.toString());
    }
	
}
