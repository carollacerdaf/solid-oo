public class CalculadoraDeSalario {
    public double calcula(Funcionario funcionario) {
        if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new DezOuVintePorCento().calcula(funcionario);
        }

        if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo() || Cargo.TESTER.equals(funcionario.getCargo()))) {
            return new QuinzeOuVinteCincoPorCento().calcula(funcionario);
        }

        throw new RuntimeException("funcionário inválido");
    }
}
