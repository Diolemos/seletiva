import java.util.List;
import java.util.ArrayList;


public class Seletiva {
    private static final double SALARIO_BASE = 2000.0;

    public static void main(String[] args) {
        

        List<Candidato> candidatosList = new ArrayList<>();

        String[] nomes = {"Sócrates", "Platão", "Aristóteles", "Pitágoras", "Heráclito",
                                    "Demócrito", "Epicuro", "Diógenes", "Zenão", "Tales",
                                    "Anaximandro", "Empédocles", "Protágoras", "Parmênides", "Anaxágoras",
                                    "Empédocles", "Demócrito", "Heráclito", "Xenófanes", "Anaxímenes"};


                                    for (String nome : nomes) {
                                        Candidato candidato = new Candidato(nome);
                                        candidatosList.add(candidato);
                                    }

                         

    }

    public static void selecionarCandidatos(ArrayList<Candidato> Candidatos, double salarioBase){

        for(Candidato Candidato:Candidatos){
            if( Candidato.getSalarioPretendido() < salarioBase){
                System.out.println("Ligar para "+Candidato.getNome());
            }
            else if(Candidato.getSalarioPretendido()==salarioBase){
                System.out.println("Ligar para "+ Candidato.getNome() +" com contra proposta");
            }
            else{
                System.out.println(Candidato.getNome()+", Aguardando o resultado dos demais candidatos");
            }
        }

      }      
}