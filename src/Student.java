
public class Student {
	int id;
	String name; 
	
	//메서드 오버로딩
	Student() {
		System.out.println("학생 생성");
	}
	Student(int id, String name) {
		insertRecord(id, name);
		
	}
	
	void insertRecord(int id, String name) {
		id = id;
		name = name;
	}
	void printInfo() {
		System.out.println("아이디: " + this.id);
		System.out.println("이름: " + this.name);
	}

}
