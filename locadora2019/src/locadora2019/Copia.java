package locadora2019;

public class Copia {
	private Filme filme;
	private int id;
	private double preco;

	public Copia(Filme filme, int id, double preco) {
		this.filme = filme;
		this.id = id;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Copia [filme=" + filme + ", id=" + id + ", preco=" + preco + "]";
	}

}
