public class MaxMin{

   public static void main(String args[]){
	if(args.length == 0){
	      System.out.println("Usage : ");
	}else{
	     long max=-99999, min=99999;
	     for(int i=0; i<args.length; i++){
		int temp = Integer.parseInt(args[i]);
		if(max<temp)
			max = temp;
		if(min>temp)
			min = temp;
	     }
	     System.out.println("'Max' = "+max+", 'Min' = "+min);
	}
   }
}