
public class CarCenter {
	public static void main(String[] args) {
		// Sonata sonata = new Sonata("Black Sonata"); repair(sonata);

		Carnival carnival = new Carnival("White Carrnival");
		repair(carnival);

		// Matiz matiz = new Matiz("Red Matiz"); repair(matiz);
	}

	static void repair(Car car) {
		if (car instanceof Sonata) {
			System.out.println("소나타가 잘 수리되었습니다.");
		} else if (car instanceof Carnival) {
			System.out.println("카니발이 잘 수리되었습니다.");
		} else if (car instanceof Matiz) {
			System.out.println("마티즈가 잘 수리되었습니다.");
		}
	}
//			System.out.println(sonata.getName() + " 이 잘 수리되었습니다.");
//		}
//		static void repair(Carnival carnival) {
//			System.out.println(carnival.getName() + " 이 잘 수리되었습니다."); 
//		}
//		static void repair(Matiz matiz) {
//			System.out.println(matiz.getName() + " 이 잘 수리되었습니다."); 
//		}
}
