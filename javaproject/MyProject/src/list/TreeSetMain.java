package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {

		// 나의 팀을 구성하고 싶다 -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장

		// ArrayList<BaseballPlayer> myTeam = new ArrayList<BaseballPlayer>();

		Set<BaseballPlayer> myTeam = new TreeSet<>();

		myTeam.add(new BaseballPlayer("강백호", 50, "kt wiz", 27));
		myTeam.add(new BaseballPlayer("소형준", 30, "kt wiz", 23));
		myTeam.add(new BaseballPlayer("고영표", 1, "kt wiz", 33));
		myTeam.add(new BaseballPlayer("강백호", 60, "kt wiz", 27));
		myTeam.add(new BaseballPlayer("배제성", 1, "kt wiz", 33));

		System.out.println("나의 팀 선수 정보");
		for (BaseballPlayer player : myTeam) {
			player.showInfo();
		}

	}

}
