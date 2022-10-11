package sec03;
public class TypeCasting {
	public static void main(String[] args) {
		int intValue = 65;
		char chValue = (char)intValue;
		char chValue2 = (char)65;
		System.out.println("intValue = "+intValue);
		System.out.println("chValue = "+chValue);
		System.out.println("chValue2 = "+chValue2);

		long longValue = 123456789123456789L;
		int intValue2 = (int)longValue;
		System.out.println("longValue = "+longValue);
		System.out.println("intValue2 = "+intValue2); // 잘못된 값이 저장됨.
		
		double dbValue = 3.14;
		int intValue3 = (int)dbValue;
		System.out.println("dbVAlue = "+dbValue);
		System.out.println("intValue3 = "+intValue3);
		
		System.out.println(10%4);
	}
}
