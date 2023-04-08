package list;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {


		Map<Integer, BaseballPlayer> myTeam = new HashMap<>();
		
		myTeam.put(30, new BaseballPlayer("소형준",30, "kt wiz", 23));
		BaseballPlayer baseballPlayer = myTeam.get(30);
		System.out.println(baseballPlayer);

	}

}
