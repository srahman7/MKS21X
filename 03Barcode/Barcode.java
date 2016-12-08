public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String zip;
    private int checkDigit;

    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception if zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public Barcode(String zips) {
	zip=zips;
	checkDigit=checkSum();
	if (zips.length() !=5){
	    throw new IllegalArgumentException();
	}
	for (int x =0;x<5;x++){
	    if (zips.charAt(x)<48 || zips.charAt(x)>57){
		throw new IllegalArgumentException();
	    }
		
	
	}
    }

    private String key(int num){
	//int num = Integer.parseInt(zip.substring(index,index+1));
	String ans="";
	if (num==0){
	    ans="||:::";
	}
	if (num==1){
	    ans=":::||";
	}
	if (num==2){
	    ans="::|:|";
	}
	if (num==3){
	    ans="::||:";
	}
	if (num==4){
	    ans=":|::|";
	}
	if (num==5){
	    ans=":|:|:";
	}
	if (num==6){
	    ans=":||::";
	}
	if (num==7){
	    ans="|:::|";
	}
	if (num==8){
	    ans="|::|:";
	}
	if (num==9){
	    ans="|:|::";
	}
	return ans;
    }
	    
    // postcondition: Creates a copy of a bar code.
    public Barcode clone(Barcode x){
	return new Barcode(x.zip);
    }
    

    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	int sum=0;
	for (int x =0; x < 5; x++){
	    sum+=Integer.parseInt(zip.substring(x,x+1));
	}
	return sum%10;
	
    }

    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String ans="";
	ans+= zip + checkDigit + " is  |";
	for (int x =0;x<5;x++){
	    ans+=key(Integer.parseInt(zip.substring(x,x+1)));
	}
	ans+=key(checkDigit)+"|";
	    
	return ans;
    }


    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	if (Integer.parseInt(zip)>Integer.parseInt(other.zip)){
	    return 1;
	}
        if (Integer.parseInt(zip)==Integer.parseInt(other.zip)){
	    return 0;
	}
	else{
	    return -1;
	}
    }
    
    /*public static void main(String[]args){
	Barcode a = new Barcode("08451");
	Barcode b= new Barcode("12345");
	System.out.println(a.toString());
	System.out.println(a.clone(b));
	System.out.println(a.toString());
	System.out.println(a.compareTo(b));
	}*/
}
