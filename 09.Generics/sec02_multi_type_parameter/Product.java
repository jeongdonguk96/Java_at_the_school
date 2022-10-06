package sec02_multi_type_parameter;

public class Product<T, M> {
	private T kind; // T : 제품의 종류 타입
	private M model; // M : 제품의 모델 타입
	
	public T getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

class Tv {
	
}

class Car {
	
}