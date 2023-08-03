import java.util.Iterator;

public class FARecordListIterator implements Iterator {
	private FARecordList list;
	private int index;

	public FARecordListIterator(FARecordList list) {
		this.list = list;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < list.size();
	}

	@Override
	public Object next() {
		FARecord record = list.get(index);
		index++;
		return record;
	}
}
