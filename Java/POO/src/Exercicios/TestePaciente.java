package Exercicios;

public class TestePaciente {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Cezar Soares");
		paciente1.setIdade(70);
		paciente1.setEspecialidadeMedica("Geriatria");
		paciente1.setNumeroPaciente(890);
		
		System.out.println("Paciente: "+paciente1.getNome()+"\tNúmero:"+paciente1.getNumeroPaciente());
		System.out.println("Especialidade a passar: "+paciente1.getEspecialidadeMedica()+"\tIdade: "+paciente1.getIdade());
	}
}
