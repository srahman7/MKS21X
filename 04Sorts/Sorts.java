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
      int index=0;
      for (int x =0; x< data.length-1;x++){
	  for (int j=1;j<data.length-1;j++){
	      if (data[j]<data[x]){
		  smallest=data[j];
		  data[j]=data[x];
		  data[x]=smallest;
	      }

	  }
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
	int[] x={64,25,12,22,11};
	System.out.println(toString(x));
	selectionSort(x);
	System.out.println(toString(x));
    }
}
