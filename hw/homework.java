public class homework{
    public static double FtoC(double t){
	    return 5.0/9*(t-32);
    }
    
    public static double CtoF(double t){
	return 32 + 9.0/5*t;
    }
    
    public static void main(String[]args){
	System.out.println(CtoF(-40.0));
	System.out.println(CtoF(100.0));
	System.out.println(FtoC(212.0));
    }
}
