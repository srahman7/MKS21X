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
    public static void insertionSort(int[] data){
	for (int x =1; x < data.length; x++){
	    int num=data[x];
	    int correctIndex=x;
	    int before=x-1;
	    while(before>=0 && num<data[before]){
		data[correctIndex]=data[before];
		correctIndex=before;
		before--;
	    }
	    data[correctIndex]=num;
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
	int[] y={3, 7, 4, 9, 5, 2, 6, 1};
	System.out.println(toString(y));
	insertionSort(y);
	System.out.println(toString(y));
    }
}
