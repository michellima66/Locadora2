package locadora2019;

import java.util.Calendar;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Filme f1 = new Filme("Mtrix", 1999, 120);
		Filme f2 = new Filme("Constantine", 2005, 120);
		Filme f3 = new Filme("De Volta para o Futuro", 1987, 120);

		Copia c1 = new Copia(f1, 1, 3.5);
		Copia c2 = new Copia(f2, 2, 4.5);
		Copia c3 = new Copia(f3, 3, 5.5);

		Socio s1 = new Socio("Wedson");
		Socio s2 = new Socio("Vitor");
		Socio s3 = new Socio("Maria");

		Date entrega = Calendar.getInstance().getTime();
		Date devolucao = Calendar.getInstance().getTime();
		System.out.println(devolucao);

		Locacao l1 = new Locacao(entrega, s1);
		l1.getListaFilmes().add(c1);
		Locacao l2 = new Locacao(entrega, s2);
		l2.getListaFilmes().add(c2);
		Locacao l3 = new Locacao(entrega, s3);
		l3.getListaFilmes().add(c3);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}

}
