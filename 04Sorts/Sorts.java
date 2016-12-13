public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "06.Rahman.Sabiha"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */

  public static void selectionSort(int[] data){
      int smallest=0;
      int bigger=0;
      int index=0;
      for (int x =0; x < data.length-1; x++){
	  smallest=data[x];
	  index=x;
	  for (int i=x+1;i<data.length;i++){
	      if (data[i]< smallest){
		  smallest=data[i];
		  index=i;
	      }
	  }
	  data[index]=data[x];
	  data[x]=smallest;
      }
  }

  
    public static String toString(int[] data){
	String ans="[";
	for (int x =0; x < data.length; x++){
	    if (x == data.length - 1){
		ans += data[x] + "]";
	    }
	    else{
		ans+= data[x]+ ", ";
	    }
	}
	return ans;
    }

    public static void main(String[]args){
	int[] x={64,25,12,11,22};
	System.out.println(toString(x));
	selectionSort(x);
	System.out.println(toString(x));
    }
}
