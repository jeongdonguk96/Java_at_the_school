package sec02_parent_constructor;

			//대한민국 국민을 표현하는 클래스
public class People {
	
	private String name;
	private String idNum;
	
	public People(String name, String idNum) {
		this.name = name;
		this.idNum = idNum;
	}

	public String getName() {
		return name;
	}


	public String getIdNum() {
		return idNum;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	
	
	
	
	
	
}
