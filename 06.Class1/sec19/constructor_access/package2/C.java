package sec19.constructor_access.package2;

import sec19.constructor_access.package1.A;

public class C {

	A a1 = new A(true);
//	A a2 = new A(1); // default는 다른 패키지에서 사용 불가
//	A a3 = new A("a"); // private는 다른 패키지에서 사용 불가
	
}
