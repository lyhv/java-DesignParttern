package builder;
/*
 * Cố gắng dấu những phần setup object nhiều bước
 * vào method đơn giản....
 */
public class Main {
	public static void main(String[] args) {
		Person person = new PersonBuilder.Builder()
				.setName("Ho Han Ly")
				.setOld(23)
				.setHouse("Nghe An")
				.build();
		System.out.println(person.getName()+"\n"+person.getOld()+"\n"+person.getHouse());
		System.out.println("I'm " + person.getName());
	}
}
