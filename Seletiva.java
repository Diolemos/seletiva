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


      selecionarCandidatos(candidatosList, SALARIO_BASE);                              

                         

    }

    public static void selecionarCandidatos(List<Candidato> Candidatos, double salarioBase){
        int candidatosSelecionados = 0;
        List<Candidato> listaSelecionados = new ArrayList<>();
        

        for(Candidato Candidato:Candidatos){
            if( Candidato.getSalarioPretendido() < salarioBase){
                System.out.println("Ligar para "+Candidato.getNome());
                listaSelecionados.add(Candidato);
                candidatosSelecionados++;
                if(candidatosSelecionados == 5){
                    
                    break;}

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