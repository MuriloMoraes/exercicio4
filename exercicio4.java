import java.util.Scanner;
public class exercicio4
{
    public static void main(String[] args){
        double nota1,nota2,nota3,nota4,media;
        System.out.println( " nota 1: ");
        nota1 = new Scanner(System.in).nextDouble();
        System.out.println( " nota 2: ");
        nota2 = new Scanner(System.in).nextDouble();
        System.out.println( " nota 3: ");
        nota3 = new Scanner(System.in).nextDouble();
        System.out.println(" nota 4: ");
        nota4 = new Scanner(System.in).nextDouble();
        
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println(" A média do aluno é "+media+ "");
        
}

}
