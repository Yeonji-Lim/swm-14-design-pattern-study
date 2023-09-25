class TitleChangeVisitor implements Visitor {
	private String newTitle;

	public TitleChangeVisitor(String newTitle) {
		this.newTitle = newTitle;
	}

	public void visitEmployee(Employee employee) {
		employee.setTitle(newTitle);
	}

	public void visitDepartment(Department department) {
		// 부서에는 직원의 직급 변경을 적용하지 않음
	}
}