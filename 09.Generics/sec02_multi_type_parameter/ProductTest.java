package sec02_multi_type_parameter;

public class ProductTest {

	public static void main(String[] args) {
		
		Product<Tv, String> p1 = new Product<Tv,String>();
		p1.setKind(new Tv());
		p1.setModel("스마트TV");
		
		Tv tv = p1.getKind();
		String model = p1.getModel();
		

	}

}
