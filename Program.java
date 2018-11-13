
public class Program {

	public static void main(String[] args) {
		ShoppingList sl = new ShoppingList();
		sl.add(new Product("apple", 7));
		sl.add(new Product("lemon", 3));
		sl.add(new Product("orange", 10));
		sl.add(new Product("milk", 5));
		sl.add(new Product("bread", 2));
		
		sl.toString();
		
		sl.removeProduct(2);
		System.out.println("\nafter remove(2):\n");
		sl.toString();
	}

}
