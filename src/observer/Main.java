package observer;

public class Main {
	/**
	 * Các đối tượng implements cùng 1 interface
	 * 
	 *các đối tượng này register với observer, mô khi có vấn
	 *đề thay đổi, observer này sẽ thông báo với các đối tượng đó
	 *thông qua interface
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
			Observer observer = new Observer();
			PersonA personA = new PersonA();
		    PersonB personB = new PersonB();
		    observer.addNotices(personA);
		    observer.addNotices(personB);
		    // Broadcast Notification for all Person
		    observer.broadcastNotice("Hello World");
	}
}
