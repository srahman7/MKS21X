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
	

    public static void bubbleSort(int[] data){
	int check=0;
	for(int x=0; x<data.length;x++){
	    for(int i=0;i<data.length-(x+1);i++){
		int first=data[i];
		int second=data[i+1];
		if(second<first){
		    data[i]=second;
		    data[i+1]=first;
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
	int[] x={64,25,12,11,22};
	int[] y={3, 7, 4, 9, 5, 2, 6, 1};
	int[] z={5,1,4,2,8}; 
	int[] v={5,4,3,2,1};
	int[] o={1,2,3};
	System.out.println(toString(v));
	bubbleSort(o);
	System.out.println(toString(o));
    }
}
