package locadora2019;

import java.util.ArrayList;

public class Filme {
	private String titulo;
	private int duracao;
	private int ano;

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", duracao=" + duracao + ", ano=" + ano + "]";
	}

	private ArrayList<String> listaAtores = new ArrayList<>();

	public Filme(String titulo, int duracao, int ano, ArrayList<String> listaAtores) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.ano = ano;
		this.listaAtores = listaAtores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public ArrayList<String> getListaAtores() {
		return listaAtores;
	}

	public void setListaAtores(ArrayList<String> listaAtores) {
		this.listaAtores = listaAtores;
	}

}
