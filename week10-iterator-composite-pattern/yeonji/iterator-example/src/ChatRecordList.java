import java.util.Iterator;

public class ChatRecordList {
	private ChatRecord[] records;
	private int size;

	public ChatRecordList() {
		records = new ChatRecord[100];
		size = 0;
	}

	public void add(ChatRecord record) {
		records[size] = record;
		size++;
	}

	public ChatRecord get(int index) {
		return records[index];
	}

	public int size() {
		return size;
	}

	public Iterator iterator() {
		return new ChatRecordListIterator(this);
	}
}
