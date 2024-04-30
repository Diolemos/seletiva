import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;



public class Candidato {
    private String nome;
    private double salarioPretendido;
    boolean selecionado;

    // Construtor
    public Candidato(String nome) {
        this.nome = nome;
         this.selecionado = false;
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
    public void setSelecionado(boolean selecionado){
        this.selecionado = selecionado;
    }
    public boolean getSelecionado(){
        return this.selecionado;
    }
}
