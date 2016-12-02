import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    private int element;
    private SuperArray supa;

    public SuperArrayIterator(SuperArray a){
	supa = a;
	element=0;
    }
    public boolean hasNext(){
	return element < supa.size();
    }
    public String next(){
	element++;
	return supa.get(element);
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
    public static void main(String[]args){
	SuperArray a= new SuperArray(10);
	SuperArrayIterator b = new SuperArrayIterator(a);
    }
}
    
	
