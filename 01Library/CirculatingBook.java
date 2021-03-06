public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;
    public CirculatingBook(String a, String b, String c, String d){
	super(a,b,c,d);
	currentHolder=null;
	dueDate=null;
    }
    public String getHolder(){
	return currentHolder;
    }
    public String getDate(){
	return dueDate;
    }
    public void setHolder(String a){
	currentHolder=a;
    }
    public void setDate(String a){
	dueDate=a;
    }
    public void checkout(String patron, String due){
	currentHolder=patron;
	dueDate=due;
    }
    public void returned(){
	currentHolder=null;
	dueDate=null;
    }
    public String circulationStatus(){
	if (currentHolder!=null && dueDate!=null){
	    return "The book is checked out under " + currentHolder + " and is due " + dueDate;
	}
	else{
	    return "The book is still available!";
	}
    }
    public String toString(){
	String ans =super.toString();
	if (currentHolder!=null && dueDate!=null){
	    ans+=". It is being borrowed by " + currentHolder + " and is due " + dueDate;
	}
	return ans;
    }
	
}
