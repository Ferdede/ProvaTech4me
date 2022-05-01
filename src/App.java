import java.util.Scanner;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception{
       String consultarpiloto;
  int Armazenamento = 2;
  int PilotosCadastrados = 0;
  ArrayList<Piloto> piloto = new ArrayList <> (Armazenamento);
    try (Scanner scanner = new Scanner(System.in)) {
    int opcao; {
      
      do {System.out.println("1 - Cadastrar Piloto");
      System.out.println("2 - Listar Pilotos");
      System.out.println("3 - Capacidade de Armazenamento atual");
      System.out.println("4 - Aumentar Capacitade de Armazenamento");
      System.out.println("5 - Localizar Piloto");
      System.out.println("6 - Sair");
    opcao = scanner.nextInt();
          switch (opcao){
          case 1: if(PilotosCadastrados == Armazenamento){System.out.println("Capacidade de armazenamento maxima atingida, selecione a opcão 4 para expandir o armazenamento!"); break ;}
          {System.out.println("Informe o nome do piloto.");
          String nome = scanner.next();
          System.out.println("Informe o CPF do piloto.");
          String cpf = scanner.next();
          Piloto Piloto = new Piloto(nome, cpf);
          piloto.add(Piloto);
          if(PilotosCadastrados < Armazenamento){PilotosCadastrados++;}
          System.out.println("Piloto Cadastrado com sucesso.");
                                             
          break;
         }case 2:if(PilotosCadastrados == 0){System.out.println("Não há pilotos cadastrados para exibir"); break;}
         {System.out.println("Listar Pilotos.");
          for(Piloto Piloto: piloto){
          System.out.println(Piloto);}
         break; } 
         
    
          case 3: {System.out.println("atualmente a capacidade é: "+Armazenamento+" Pilotos.");
          break;}

         case 4: {System.out.println("Informe qual a nova capacidade de armazenamento.");
                   Armazenamento = scanner.nextInt(); 
                   System.out.println("Capacidade de armazenamento aumentada.");
                   
                   break;} 
                   case 5: {System.out.println("Informe o CPF do piloto que deseja localizar.");
                            consultarpiloto = scanner.next();
                            for(Piloto Piloto: piloto){}

                            break;}
                           case 6: {System.out.println("Você saiu do sistema");}
        
         }} while (opcao!= 6);
         scanner.close();
         }
         } 
        } }
     
         