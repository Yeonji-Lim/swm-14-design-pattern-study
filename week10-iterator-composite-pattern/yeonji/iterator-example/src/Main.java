import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ChatRecordList chatRecordList = new ChatRecordList();
		chatRecordList.add(new ChatRecord("Alice", "Hello"));
		chatRecordList.add(new ChatRecord("Bob", "Hi"));
		chatRecordList.add(new ChatRecord("Alice", "How are you?"));
		chatRecordList.add(new ChatRecord("Bob", "Fine, thanks."));
		chatRecordList.add(new ChatRecord("Alice", "Bye"));
		chatRecordList.add(new ChatRecord("Bob", "Bye"));

		Iterator chatRecordListIterator = new ChatRecordListIterator(chatRecordList);
		while (chatRecordListIterator.hasNext()) {
			ChatRecord chatRecord = (ChatRecord) chatRecordListIterator.next();
			System.out.println(chatRecord.toString());
		}

		System.out.println("--------------------");

		FARecordList faRecordList = new FARecordList();
		faRecordList.add(new FARecord("Alice", "Hello"));
		faRecordList.add(new FARecord("Bob", "Hi"));
		faRecordList.add(new FARecord("Alice", "How are you?"));
		faRecordList.add(new FARecord("Bob", "Fine, thanks."));
		faRecordList.add(new FARecord("Alice", "Bye"));
		faRecordList.add(new FARecord("Bob", "Bye"));

		Iterator faRecordListIterator = new FARecordListIterator(faRecordList);
		while (faRecordListIterator.hasNext()) {
			FARecord faRecord = (FARecord) faRecordListIterator.next();
			System.out.println(faRecord.toString());
		}
	}
}
