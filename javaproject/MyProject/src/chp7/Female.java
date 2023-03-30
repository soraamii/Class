package chp7;

public class Female extends Person {


		
		String job;
		
		public Female() {
			
		}
		
		public Female (String name,String id, String job) {
			super(name,id);
			this.job = job;
			
		}
		
		@Override
		void hi() {
			super.hi();
			System.out.println("제 직업은 " + job + "입니다.");
		}
		
		public static void main(String[] args) {
			
			Female female = new Female();
			
			female.name = "강백호";
			female.job = "야구선수";
			
			female.hi();
		}
	
	}


