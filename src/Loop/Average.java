package Loop;

public class Average {
	public static void main(String[] arsg) {
		int total=0;
		int count=0;
		for(int i=0;i<=1000;i++) {
			total=total+i;
			count=count+1;
			}
		System.out.println(total/count);
	}

}
