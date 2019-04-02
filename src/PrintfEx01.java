
public class PrintfEx01 {

	public static void main(String[] args) {
//		System.out.println(10/3);
//		System.out.println(10/3.0);
		System.out.printf("%.2f%n", 10.0/3 );
	
//		System.out.printf("%d%n", 15);
//		System.out.printf("%#o%n", 15);
//		System.out.printf("%#x%n", 15);
//		System.out.printf("%s%n", Integer.toBinaryString(15));
//
//		float f = 123.456789f;
//		System.out.printf("%f%n",f);  // 정밀도가 7이라 7자리까지만 정확하고 나머지는 의미없는 숫자
//		double d = 123.456789;
//		System.out.printf("%f%n", d);
//		System.out.printf("%g%n", d);
//		System.out.printf("%e%n", d);
		
		System.out.printf("[%5d]%n", 1234567);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d);
		System.out.printf("%14.6f%n", d);  // 보이는 것만 줄어듬
		System.out.printf("%.10f%n", d);
		
		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");

	}

}
