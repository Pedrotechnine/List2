import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Qual exercicio deseja executar ?");
    int ex = leitor.nextInt();

    switch (ex) {
      case 1:
        Exercicio01.Executar();
        break;
        case 2:
        Exercicio02.Executar();
        break;
        case 3:
        Exercicio03.Executar();
        break;
        case 4:
        Exercicio04.Executar();
        break;
        case 5:
        Exercicio05.Executar();
        break;
        case 6:
        Exercicio06.Executar();
        break;
        case 7:
        Exercicio07.Executar();
        break;
        case 8:
        Exercicio08.Executar();
        break;
        case 9:
        Exercicio09.Executar();
        break;
        case 10:
        Exercicio10.Executar();
        break;
        case 11:
        Exercicio11.Executar();
        break;
        case 12:
        Exercicio12.Executar();
        break;
        case 13:
        Exercicio13.Executar();
        break;
        case 14:
        Exercicio14.Executar();
        break;
        case 15:
        Exercicio15.Executar();
        break;
        
       
      default:
        System.out.println("Número de exercicio inválido.");
        break;
    }
    leitor.close();
  }
}