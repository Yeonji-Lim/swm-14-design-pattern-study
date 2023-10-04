public class Main {
	public static void main(String[] args) {
		Department engineering = new Department("개발팀");
		Department sales = new Department("사업팀");

		Employee 도연 = new Employee("John", "주니어 엔지니어");
		Employee 하은 = new Employee("Sarah", "매니저");
		Employee 상현 = new Employee("Mike", "영업사원");

		engineering.add(도연);
		engineering.add(하은);
		sales.add(상현);

		Visitor titleChangeVisitor = new TitleChangeVisitor("선임 연구원");
		engineering.accept(titleChangeVisitor);

		System.out.println("도연's new title: " + 도연.getTitle());
		System.out.println("하은's new title: " + 하은.getTitle());
		System.out.println("상현's new title: " + 상현.getTitle());
	}
}
