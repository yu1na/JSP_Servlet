package common;

public class MyClass
{
	public static int myFunc(int a, int b) {
		int sum = 0;
		for(int i = a ; i< b; i++) {
			sum += i;
		}
		return sum;
	}
}
