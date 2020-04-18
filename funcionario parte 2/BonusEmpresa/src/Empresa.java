
import javax.swing.JOptionPane;

public class Empresa {

	RH rh;
	static int id = 1;

	Empresa() {

		this.rh = new RH();
	}

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		for (int i = 0; i < 5; i++) {
			empresa.rh.adicionarFuncionario(empresa.contratarFuncionario());
		}

		empresa.rh.mostrarBonusTodosFuncionarios();

	}

	Funcionario contratarFuncionario() {

		Funcionario f = new Funcionario();

		String nome = JOptionPane.showInputDialog("Nome: ");
		String matricula = JOptionPane.showInputDialog("Matricula: ");
		int faltasNoAno = Integer.parseInt(JOptionPane.showInputDialog("Faltas no ano: "));
		float ultimaNotaAvaliacao = Float.parseFloat(JOptionPane.showInputDialog("Ultima nota de avaliação: "));

		f.setID(id);
		f.setNome(nome);
		f.setMatricula(matricula);
		f.setFaltasNoAno(faltasNoAno);
		f.setUltimaNotaAvaliacao(ultimaNotaAvaliacao);

		id++;

		JOptionPane.showMessageDialog(null, "Funcinario cadastrado");

		return f;

	}

}
