package sec13_init_block;

public class BlockTest {

	static {
		System.out.println("static 블록 = static { }");
	}
	
	{
		System.out.println("인스턴스 블록 = { }");
	}
	
	// 생성자
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		
		BlockTest bt = new BlockTest();
		
		
				
	}

}
