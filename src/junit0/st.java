package junit0;

public class st {

	public st() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //test(0, 0, 0);
	}

	public static String test(int a,int b,int c) {
		// TODO Auto-generated method stub
		String string = "This is not a Triangle";
		if((a + b <= c)||(b + c <= a)||(a + c <= b))
			return string;
		string = "This is a scalene Triangle";
		if((a == b)||(b == c)||(c == a))
			string = "This is a isosceles Triangle";
		    if((a == b)&&(b == c))
		    	string = "This is a equilateral Triangle";
		return string;
		
	}

}
