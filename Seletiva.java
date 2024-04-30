import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


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
      

      List<Candidato> listaSelecionados = new ArrayList<Candidato>();
      for(Candidato Candidato:candidatosList){
        if(Candidato.selecionado){
            listaSelecionados.add(Candidato);
        }
      }                              
      contatarSelecionados(listaSelecionados);
    }

    public static void selecionarCandidatos(List<Candidato> Candidatos, double salarioBase){
        int candidatosSelecionados = 0;
        List<Candidato> listaSelecionados = new ArrayList<>();
        

        for(Candidato Candidato:Candidatos){
            if( Candidato.getSalarioPretendido() < salarioBase){
                Candidato.setSelecionado(true);
                System.out.println("Ligar para "+Candidato.getNome());
                listaSelecionados.add(Candidato);
                candidatosSelecionados++;
                if(candidatosSelecionados == 5){
                    imprimirNomeSelecionados(listaSelecionados);
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
      
      public static void imprimirNomeSelecionados(List<Candidato>listaSelecionados){
        System.out.println("\n Os Candidatos selecionados São: \n");
        for(Candidato Candidato:listaSelecionados){
            System.out.println(Candidato.getNome());
        }
      }
      public static void contatarSelecionados(List<Candidato> listaSelecionados) {
        for (Candidato candidato : listaSelecionados) {
            int tentativas = 0;
            boolean tentativaBemSucedida = false;
    
            do {
                int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
                tentativas++;
                if (randomNum % 2 == 0) {
                    tentativaBemSucedida = true;
                    System.out.println("Conseguimos contatar " + candidato.getNome() + " depois de " + tentativas + " tentativa(s)");
                    continue;
                }
            } while (tentativas < 3 && !tentativaBemSucedida);
    
           
            if (!tentativaBemSucedida) {
                System.out.println("Não conseguimos contato com " + candidato.getNome() + ".");
            }
        }
    }

}