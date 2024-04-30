import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;



public class Candidato {
    private String nome;
    private double salarioPretendido;

    // Construtor
    public Candidato(String nome) {
        this.nome = nome;
        double randomDouble = ThreadLocalRandom.current().nextDouble(1800, 2200);
        DecimalFormat df = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.US));
        String salarioFormatado = df.format(randomDouble);
        this.salarioPretendido = Double.parseDouble(salarioFormatado);

       

    }

   //Getters Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPretendido() {
        return salarioPretendido;
    }

    public void setSalarioPretendido(double salarioPretendido) {
        this.salarioPretendido = salarioPretendido;
    }
}
