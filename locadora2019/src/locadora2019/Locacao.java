package locadora2019;

import java.util.ArrayList;
import java.util.Date;
import java.util.Date;

public class Locacao {
	private Date dataLocacao;
	private Date dataDevolucao;
	private Socio socio;
	private ArrayList<Copia> listaFilmes = new ArrayList<>();

	public Locacao(Date dataLocacao, Socio socio) {
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
		this.socio = socio;
	}

	public Locacao(Date dataLocacao, Socio socio) {
		super();
		this.dataLocacao = dataLocacao;
		this.socio = socio;
	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public ArrayList<Copia> getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(ArrayList<Copia> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}

	public double calculaTotal() {
		return 0;
	}

	@Override
	public String toString() {
		return "Locacao [dataLocacao=" + dataLocacao + ", socio=" + socio + ", listaFilmes=" + listaFilmes + "]";
	}

}
