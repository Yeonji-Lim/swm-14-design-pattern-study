class Employee implements OrganizationalComponent {
	private String name;
	private String title;

	public Employee(String name, String title) {
		this.name = name;
		this.title = title;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitEmployee(this);
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
