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
	if (zips.length() !=5){
	    throw new IllegalArgumentException();
	}
	for (int x =0;x<5;x++){
	    if (zips.charAt(x)<48 || zips.charAt(x)>57){
		throw new IllegalArgumentException();
	    }
	}
	
	zip=zips;
	checkDigit=checkSum();
		
	
    }

    private static String key(int num){
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

    private static int key(String s){
	int num=0;
	if (s.equals("||:::")){
	    num=0;
	}
	else if (s.equals(":::||")){
	    num=1;
	}
	else if (s.equals("::|:|")){
	    num=2;
	}
	else if (s.equals("::||:")){
	    num=3;
	}
	else if (s.equals(":|::|")){
	    num=4;
	}
	else if (s.equals(":|:|:")){
	    num=5;
	}
	else if (s.equals(":||::")){
	    num=6;
	}
	else if (s.equals("|:::|")){
	    num=7;
	}
	else if (s.equals("|::|:")){
	    num=8;
	}
	else if (s.equals("|:|::")){
	    num=9;
	}
	else{
	    throw new IllegalArgumentException("What you entered is not a known number");
	}
	return num;
    }
	
	
	

    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
	int sum=0;
	for (int x =0; x < 5; x++){
	    sum+=Integer.parseInt(zip.substring(x,x+1));
	}
	return sum%10;
	
    }
    private static int checkSum(String z){
	int sum=0;
	for (int x =0; x < 5; x++){
	    sum+=Integer.parseInt(z.substring(x,x+1));
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

    public static String toZip(String s){
	String ans="";
	if (s.length()!=32){
	    throw new IllegalArgumentException("Incorrect zip length");
	}
	if (s.charAt(0)!='|' || s.charAt(31)!='|'){
	    throw new IllegalArgumentException("The barcode you entered did not begin or end with a |");
	}
	for (int x =0; x<32; x++){
	    if (s.charAt(x)!='|' &&  s.charAt(x)!=':'){
		throw new IllegalArgumentException("You entered an invalid character");
	    }
	}
	for (int x=1;x<26;x+=5){
	    ans+=key(s.substring(x,x+5));
	}
	if (checkSum(ans)!=key(s.substring(26,31))){
	    throw new IllegalArgumentException("checkSum failed!");
	}
        //System.out.println(checkSum(ans));
	//System.out.println(s.substring(26,31));

	return ans;
    }

    public static String toCode(String z){
	String ans="|";
	int check=0;
	for (int x =0;x<5;x++){
	    ans+=key(Integer.parseInt(z.substring(x,x+1)));
	    check+=Integer.parseInt(z.substring(x,x+1));
	}
	ans+=key(check%10)+"|";
	    
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
    
    public static void main(String[]args){
	Barcode a = new Barcode("08451");
	Barcode b= new Barcode("12345");
	Barcode c = new Barcode("90210");
	System.out.println(a.toString());
	//System.out.println(a.clone(b));
	System.out.println(a.toString());
	System.out.println(a.compareTo(b));
	System.out.println(toCode("90210"));
	System.out.println(c.toString());
	System.out.println(toZip(toCode("90210")));
	System.out.println(toZip("||:|::||:::::|:|:::||||:::|:::||"));
	
	}
}
