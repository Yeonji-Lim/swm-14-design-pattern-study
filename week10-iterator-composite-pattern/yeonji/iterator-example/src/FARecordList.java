public class FARecordList {
	private FARecord[] records;
	private int size;

	public FARecordList() {
		records = new FARecord[100];
		size = 0;
	}

	public void add(FARecord record) {
		records[size] = record;
		size++;
	}

	public FARecord get(int index) {
		return records[index];
	}

	public int size() {
		return size;
	}


}
