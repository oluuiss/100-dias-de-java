package dia03.exercicio_funcionarios;

public class FuncionariosDAO {
    public String Name;
    public double GrossSalary;
    public double Tax;
    public double Porcentagem;


    public double SalarioLiquido() {
        return GrossSalary - Tax;
    }

    public double AumentarSalario() {
        return GrossSalary = GrossSalary * (Porcentagem / 100);
    }

    public String toString() {
        return Name + ", " + String.format("%.2f", SalarioLiquido());
    }
}
