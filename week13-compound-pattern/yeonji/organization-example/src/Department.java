import java.util.ArrayList;
import java.util.List;

class Department implements OrganizationalComponent {
	private String name;
	private List<OrganizationalComponent> employees = new ArrayList<>();

	public Department(String name) {
		this.name = name;
	}

	public void add(OrganizationalComponent component) {
		employees.add(component);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitDepartment(this);
		for (OrganizationalComponent employee : employees) {
			employee.accept(visitor);
		}
	}

	public List<OrganizationalComponent> getEmployees() {
		return employees;
	}
}