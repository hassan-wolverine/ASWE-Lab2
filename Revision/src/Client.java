import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		IArea r = new Rectangle(3, 4);
		System.out.println(r.getArea());

		r = new Square(5);
		System.out.println(r.getArea());

		ArrayList<Shape> l = new ArrayList<>();
		l.add(new Rectangle(3, 4));
		l.add(new Square(5));
		for (Shape shape : l) {
			System.out.println(shape.getCircumference());
		}

	}
}
