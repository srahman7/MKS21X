public class ReferenceBook extends LibraryBook{
    private String collection;
    public ReferenceBook(String a, String b, String c, String d, String e){
	super(a,b,c,d);
	collection=e;
    }
    public String getCollect(){
	return collection;
    }
    public void setCollect(String a){
	collection=a;
    }
    public void checkout(ReferenceBook a){
	System.out.println("Cannot checkout a reference book.");
    }
    public void returned(ReferenceBook a){
	System.out.println("reference book could not have been checked out -- return impossible");
    }
}
