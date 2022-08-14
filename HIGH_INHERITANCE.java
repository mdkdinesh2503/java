class Circle extends HIGH_INHERITANCE{
	void Draw() {
		System.out.println("Drawing Circle");
	}
	void Erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends HIGH_INHERITANCE{
	void Draw() {
		System.out.println("Drawing  Triangle");
	}
	void Erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends HIGH_INHERITANCE{
	void Draw() {
		System.out.println("Drawing Square");
	}
	void Erase() {
		System.out.println("Erasing Square");
	}
}
public class HIGH_INHERITANCE {
	void Draw() {
		System.out.println("Drawing Shape");
	}
	void Erase() {
		System.out.println("Erasing Shape");
	}
	public static void main(String[] args) {
		HIGH_INHERITANCE c=new Circle();
		c.Draw();
		c.Erase();
		HIGH_INHERITANCE t=new Triangle();
		t.Draw();
		t.Erase();
		HIGH_INHERITANCE s=new Square();
		s.Draw();
		s.Erase();
	}
}