public class GCDLCM{
	public static void main(String args[]){
		if(args.length == 2){
			int a, b;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			System.out.print(a+", "+b+" GCD : ");
			System.out.println(GCD(a, b));
			System.out.print(a+", "+b+" LCM : ");
			System.out.println(LCM(a, b));
		}else{
			System.out.println("Usage : $ java GCDLCM num1 num2");
		}
	}
	private static int GCD(int a, int b){
		int result=0, small, big;
		if(a<b){
			small=a;
			big=b;
		}else{
			small=b; 
			big=a;
		}
		for(int i=1; i<=small/2; i++){
			if((small%i)==0)
				if((big%i)==0)
					result = i;
		}
		return result;
	}
	private static int LCM(int a, int b){
		int result, small, big, smallstep, bigstep;
		if(a<b){
			small=a;
			big=b;
		}else{
			small=b;
			big=a;
		}
		smallstep = small;
		bigstep = big;
		while(small != big){
			int temp;
			while(small<big){
				small += smallstep;
				//System.out.println(small + " : " + big);
			}
			temp = small;
			small = big;
			big = temp;
			temp = smallstep;
			smallstep = bigstep;
			bigstep = temp;
		}
		result = small;	
		return result;
	}
}