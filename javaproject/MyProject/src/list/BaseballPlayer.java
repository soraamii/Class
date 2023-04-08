package list;


// 야구선수의 정보를 저장하는 클래스 : 야구선수 데이터 저장 => 인스턴스 생성 -> 배열 -> List
public class BaseballPlayer {

	private String name;
	private int number;
	private String team;
	private int age;
	
	
	public BaseballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}



	public BaseballPlayer() {
		// 기본생성자 
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		
		return this.age;
	}


	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if(obj != null && obj instanceof BaseballPlayer) {
			
			BaseballPlayer player = (BaseballPlayer)obj;
			result = this.team.equals(player.getTeam()) 
					&& this.name.equals(player.name) 
					&& this.age == player.getAge();
		}
		
		
		return result;
	}

	@Override
	public String toString() {
		return "BaseballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	
	public void showInfo() {
		System.out.printf("[%s] %s(%d, %d)\n", this.team, this.name, this.number, this.age);
	}
	
	
	
	
	

	
	
	
	
	
	
}
