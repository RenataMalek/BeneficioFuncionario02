
public class Funcionario {

	private long id;
	private String nome;
	private String matricula;
	private double salario;
	private int faltasNoAno;
	private float ultimaNotaAvaliacao;
	private int qtdPremiosRecebidosNoAno;
	private boolean graduado;
	private String nomeFaculdade;
	private String nomeCurso;

	public void setID(long id) {
		this.id = id;
	}

	public long getID() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;

	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setFaltasNoAno(int faltasNoAno) {
		this.faltasNoAno = faltasNoAno;
	}

	public int getFaltasNoAno() {
		return faltasNoAno;
	}

	public void setUltimaNotaAvaliacao(float ultimaNotaAvaliacao) {
		this.ultimaNotaAvaliacao = ultimaNotaAvaliacao;
	}

	public float getUltimaNotaAvaliacao() {
		return ultimaNotaAvaliacao;
	}

	public void setQtdPremiosRecebidosNoAno(int qtdPremiosRecebidosNoAno) {
		this.qtdPremiosRecebidosNoAno = qtdPremiosRecebidosNoAno;
	}

	public int getQtdPremiosRecebidosNoAno() {
		return qtdPremiosRecebidosNoAno;
	}

	public void setGraduado(boolean graduado) {
		this.graduado = graduado;
	}

	public boolean getGraduado() {
		return graduado;
	}

	public void setNomeFaculdade(String nomeFaculdade) {
		this.nomeFaculdade = nomeFaculdade;
	}

	public String getNomeFaculdade() {
		return nomeFaculdade;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}
}
