import java.util.ArrayList;
import java.util.List;

public class RH {

	static List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	double valorBonus(Funcionario funcionario) {
		double desconto = 0;
		int falta = funcionario.getFaltasNoAno();

		if (falta < 2) {
			desconto = funcionario.getSalario() * 0.30;
		} else if (falta < 5) {
			desconto = funcionario.getSalario() * 0.15;
		} else {
			desconto = funcionario.getSalario() * 0.05;
		}

		float avaliacao = funcionario.getUltimaNotaAvaliacao();

		if (avaliacao > 7) {
			desconto += funcionario.getSalario() * 0.30;
		} else if (avaliacao >= 5 && avaliacao <= 7) {
			desconto += funcionario.getSalario() * 0.15;
		} else {
			desconto += funcionario.getSalario() * 0.05;
		}

		return desconto;
	}

	void mostrarBonusTodosFuncionarios() {

		RH rh = new RH();
		double bonus;
		for (Funcionario f : funcionarios) {
			bonus = rh.valorBonus(f);
			System.out.println(f.getNome() + " ganhou R$ " + bonus + " de bonus.");
		}

	}

	void adicionarFuncionario(Funcionario f) {

		funcionarios.add(f);

	}

	void removerFuncionario(Funcionario f) {

		funcionarios.remove(f);

	}

}
