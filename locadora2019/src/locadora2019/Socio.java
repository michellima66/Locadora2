package locadora2019;

import java.util.ArrayList;

public class Socio {
	private String nome;
	private String endereco;
	private String telefone;
	private String documento;
	private ArrayList<Locacao> historicoLocacao = new ArrayList<>();

	public Socio(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public ArrayList<Locacao> getHistoricoLocacao() {
		return historicoLocacao;
	}

	public void setHistoricoLocacao(ArrayList<Locacao> historicoLocacao) {
		this.historicoLocacao = historicoLocacao;
	}

	@Override
	public String toString() {
		return "Socio [nome=" + nome + "]";
	}

}
