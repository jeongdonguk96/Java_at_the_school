package sec01;

public class RefVariable {

	public static void main(String[] args) {
		
		String refVar1 = new String("abc");
		String refVar2 = new String("abc");
		
		if (refVar1 == refVar2) {
			System.out.println("refVar1과 refVar2의 주소가 같습니다.");
		} else {
			System.out.println("refVar1과 refVar2의 주소가 다릅니다.");
		}
		
		if (refVar1.equals(refVar2)) {
			System.out.println("refVar1과 refVar2의 주소가 같습니다.");
		} else {
			System.out.println("refVar1과 refVar2의 주소가 다릅니다.");
		}

	}
}