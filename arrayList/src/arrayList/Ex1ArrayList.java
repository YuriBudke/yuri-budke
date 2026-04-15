package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex1ArrayList {

	public static void main(String[] args) {

		List<String> listaNomes = new ArrayList<>();
		
		listaNomes.add("Romero");
		listaNomes.add("Eduardo");
		listaNomes.add("Kevin");
		listaNomes.add("Pedro");
		listaNomes.add("João");
		
		listaNomes.sort(null);
		
		System.out.println(listaNomes);
		
	}

}
