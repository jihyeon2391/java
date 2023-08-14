package exam1;
class TV {
	
}

class Car {
	
}




class Product <K, M> {
	private K kind;
	private M model;
	
	//getter()----반환 타입 o
	K getKind() {
		return this.kind;
	}
	
	M getModel() {
		return this.model;
	}
	
	//setter()---
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}
public class ProductTest {
	public static void main(String[] args) {
		Product<TV, String> product1 = new Product();
		product1.setKind(new TV());
		product1.setModel("Smart TV");
		
		System.out.println("제품 정보 : " + product1.getModel());
	}

}
