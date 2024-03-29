package controller;

import br.edu.fateczl.pilhaint.*;

public class FatController {

	public FatController() {
		super();
	}

	public int fatorial(int valor) {
		Pilha p = new Pilha();
		int valorCont = valor;
		int fat = 0;
		for (int i = 0; i < valorCont; i++) {
			p.push(valor);
			valor--;
		}
		int v1 = 0;
		int v2 = 0;
		while (p.size() != 1) {
			try {
				v1 = p.pop();
				v2 = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			p.push(v1 * v2);
		}
		try {
			fat = p.top();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return fat;
	}

}
