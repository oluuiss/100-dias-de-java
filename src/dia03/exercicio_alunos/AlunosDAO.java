package dia03.exercicio_alunos;

public class AlunosDAO {
    public String Nome;
    public double Nota1;
    public double Nota2;
    public double Nota3;
    public double MediaNota;
    public double Media;
    public double Passar;

    public double CalcularNota() {
        return MediaNota = Nota1 + Nota2 + Nota3;
    }

    public double CalcularMedia() {
        return Media = MediaNota / 3;
    }

    public String toString() {
        return Nome + ", " + String.format("%.2f", CalcularMedia());
    }
}
