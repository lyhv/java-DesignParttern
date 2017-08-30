package observer;

public class PersonA implements NoticeLitsener{

	public void notification(String messager) {
		System.out.println(messager);
	}

}
