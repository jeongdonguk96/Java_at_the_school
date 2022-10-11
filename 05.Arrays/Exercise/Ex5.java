package Exercise;

public class Ex5 {

	public static void main(String[] args) {
		
		String[] name = {"학교", "소년", "집", "의자", "꽃", "학교", "집"};
		
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name.length; j++) {
				if(i==j) continue;
				if(name[i].equals(name[j])) {
					System.out.println("종북된 문자열은 = " + name[j]);
					break;
				} 
			}
		}
		
	}
}