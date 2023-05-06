package todo.domain;

// DTO : 데이터를 전송하기 위한 객체

// 보통 DTO는 Java Beans 형식으로 정의
// 데이터베이스 테이블의 컬럼 이름과 변수 이름을 일치 시키는 게 기본

public class TodoDTO {

	// 인스턴스 변수 생성

	private int tno;
	private String todo;
	private String duedate;
	private boolean finished;

	// 기본 생성자 생성

	public TodoDTO() {
	}

	// 인자가 있는 생성자 생성

	public TodoDTO(int tno, String todo, String duedate, boolean finished) {

		this.tno = tno;
		this.todo = todo;
		this.duedate = duedate;
		this.finished = finished;
	}

	// Getter/Setter

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	// toString

	@Override
	public String toString() {
		return "TodoDTO [tno=" + tno + ", todo=" + todo + ", duedate=" + duedate + ", finished=" + finished + "]";
	}

}
