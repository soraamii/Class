package chp7;

public class Male extends Person {


		
		int age;
		
		public Male() {
			
		}
		
		public Male(String name, String id, int age) {
			super(name, id);
			this.age = age;
		}
		
		@Override
		void hi () {
			super.hi();
			System.out.println(age + "살입니다.");
		}
		
		public static void main(String[] args) {
			Male male = new Male("강백호","970729-1111111", 26);
			
//			male.name = "강백호";
//			male.id = "970729-1111111";
//			male.age = 26;
//			
			male.hi();
			
			
		}

	}


