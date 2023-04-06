package list;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {


		HashSet<BaseballPlayer> team  = new HashSet<BaseballPlayer>();
		
		team.add(new BaseballPlayer("강백호",50, "kt wiz", 27));
		team.add(new BaseballPlayer("소형준",30, "kt wiz", 23));
		team.add(new BaseballPlayer("고영표",1, "kt wiz", 33));
		team.add(new BaseballPlayer("고영표",1, "kt wiz", 33));
		team.add(new BaseballPlayer("소형준",30, "kt wiz", 23));

		
		System.out.println(team.size());
	}

}
