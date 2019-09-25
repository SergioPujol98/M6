package UF1;

import java.util.*;

public class TestHashMap {
	public static void main(String[] args) {
		int cod_banco;
		Map<Integer, String> bancos = new HashMap<Integer, String>();
		bancos.put(1827, "BBVA");
		bancos.put(1049, "Santander");
		bancos.put(2038, "Bankia");
		bancos.put(2100, "La Caixa");
		Iterator it = bancos.keySet().iterator();
		System.out.println(bancos.get(1827));
		System.out.println(bancos.containsValue("BBVA"));
		System.out.println(bancos.values());
		System.out.println();
		while (it.hasNext()) {
			cod_banco = (int) it.next();
			System.out.println(cod_banco + ": " + bancos.get(cod_banco));

		}

	}
}
