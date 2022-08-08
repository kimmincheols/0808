/*
 * Polymorphism의 조건
 * 1. Method's Override
 * 2. Object Cast (객체의 형변환)
 * 		1) Value Type
 * 			a. 자동형변환(Implicit conversion) Promotion(승진) : 小 -> 大
 * 			b. 강제형변환(Explicit conversion),Demosion : 大 -> 小, () 연산사를 사용
 * 		2) Object Type 
 * 			a. 자동형변환(Implicit conversion, Promotion) Promotion(승진) : 자식 -> 부모(Always 성공)
 * 			b. 강제형변환(Explicit conversion, Cast Down),Demosion :	부모 -> 자식(강제적 형변환만 가능하며, 될 때도 있고 안될 때도 있다)
 */

public class PolymorphismDemo {
	public static void main(String[] args) {
		//Test t = new Test();
		//Demo d = new Demo();
		Test t = new Demo();
		
//		if(t instanceof Demo) {
//		d = (Demo)t;
//		}else {
//			System.out.println("형변환 안되지롱ㅋ");
//		}
	}
}

class Test{}
class Demo extends Test{}