public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;
    public LibraryBook(String a, String b, String c, String d){
	super(a,b,c);
	callNumber=d;
    }
    public String getCallNum(){
	return callNumber;
    }
    public void setCallNum(String a){
	callNumber=a;
    }
    public abstract void checkout(String patron, String due);
    public abstract void returned();
    public abstract String circulationStatus();
    public int compareTo(LibraryBook a){
	return getCallNum().compareTo(a.callNumber);
    }
    public String toString(){
	return super.toString() + ", and has a call number of " + callNumber;
    }

}
