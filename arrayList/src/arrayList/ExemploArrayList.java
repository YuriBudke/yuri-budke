package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {

		List<Integer> listaNumeros = new ArrayList<>();
		
		listaNumeros.add(1);
		listaNumeros.add(21);
		listaNumeros.add(14);
		listaNumeros.add(30);
		
		
		System.out.println(listaNumeros.indexOf(21));
		System.out.println(listaNumeros);
		
	}

}
