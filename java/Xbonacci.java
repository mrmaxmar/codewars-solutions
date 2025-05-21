public class Xbonacci {
	public static void main(String[] args) {
	double[] test = {1,1,1};
	System.out.println(java.util.Arrays.toString(new Xbonacci().tribonacci(test, 5)));
	
/*	
    This works if you make the below method static.
    double[] rslt = tribonacci(test, 5);
	for (int i=0; i < rslt.length; i++){
	System.out.println(rslt[i]);
	} 
	
	Also acceptable:
        Xbonacci x = new Xbonacci();
		double[] rslt = x.tribonacci(test, 5);
    	for (int i=0; i < rslt.length; i++){
    	System.out.println(rslt[i]);
	*/
	
}

  public double[] tribonacci(double[] s, int n) {
	if(n==0){
	return new double[0];
	}

	if(n<=3){
		double[] result = new double[n];
		for (int i = 0; i < n; i++){
			result[i] = s[i];
		}
		return result;
	}

	double[] result = new double[n];
	result[0]=s[0];
	result[1]=s[1];
	result[2]=s[2];

	for(int i = 3; i < n; i++) {
		result[i] = result[i-1] + result[i-2] + result[i-3];
	}
	return result;
  }
}