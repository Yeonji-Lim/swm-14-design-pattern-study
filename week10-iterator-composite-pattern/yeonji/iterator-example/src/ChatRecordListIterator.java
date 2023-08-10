import java.util.Iterator;

public class ChatRecordListIterator implements Iterator {
	private ChatRecordList list;
	private int index;

	public ChatRecordListIterator(ChatRecordList list) {
		this.list = list;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < list.size();
	}

	@Override
	public Object next() {
		ChatRecord record = list.get(index);
		index++;
		return record;
	}
}
