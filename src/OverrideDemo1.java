
public class OverrideDemo1 {
	public static void main(String[] args) {
		Point original = new Point(30, 50);
		Point another = new Point(30, 50);
		if (original.equals(another))
			System.out.println("같다ㅎ");
		else
			System.out.println("다르지롱ㅋ");
	}
}

class Point extends Object {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point child = (Point) obj;
		if (this.x == child.x && this.y == child.y)
			return true;
		else
			return false;

	}

}
