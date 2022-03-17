package usethis;

public class UseThis {
	public static void main(String[] args) {
		Child c = new Child();
		Child parent = new Parent();
		Parent p = (Parent) parent;

		p.Childs();
		

	}

}
