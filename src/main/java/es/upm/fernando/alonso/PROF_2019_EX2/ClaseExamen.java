package es.upm.fernando.alonso.PROF_2019_EX2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ClaseExamen
 *
 */
public class ClaseExamen {

	public static List<Integer> primos(int n) throws EntradaInvalidaException {
		
		// Check invalid
		if(n < 2) {
			throw new EntradaInvalidaException("Entrada inválida, n es menor que 2");
		}

		ArrayList<Integer> primos = new ArrayList<Integer>();
		
		List<Integer> divisoresPrimos = getPrimosHasta(n);
		
		int num = n;
		
		for (Integer div : divisoresPrimos) {
			
			while(num % div == 0) {
				num /= div;
				primos.add(div);
			}
		}
		
		primos.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		return primos;
	}

	private static List<Integer> getPrimosHasta(int n) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		for (int i = n; i > 0; i--) {
			int div = 0;

			for (int j = 1; j <= i && div <=2; j++) {
				if (i % j == 0) {
					div++;
				}
			}
			// primo
			if (div == 2) {
				l.add(i);
			}

		}
		return l;
	}
	
	public static void main(String[] args) throws EntradaInvalidaException {
		System.out.println(primos(-5));
	}
}
