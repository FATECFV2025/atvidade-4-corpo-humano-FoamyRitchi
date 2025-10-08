import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        
        double aMassa = leitura.nextDouble();
        System.out.println("Massa inicial (kg): " + aMassa + "kg");
        double aVolume = leitura.nextDouble();
        System.out.println("Volume inicial (m³): " + aVolume + "m³");
        double aDensidade = leitura.nextDouble();
        System.out.println("Densidade inicial (kg/m³): " + aDensidade + "kg/m³");
        double aAltura = leitura.nextDouble();
        System.out.println("Altura inicial (m): " + aAltura + "m");
        leitura.close();
        
        System.out.println("Digite novos dados: ");

        double imc = aMassa/(aAltura*aAltura);
        System.out.println("IMC: " + imc);

        aMassa = leitura.nextDouble();
        System.out.println("Massa inicial (kg): " + aMassa + "kg");
        aVolume = leitura.nextDouble();
        System.out.println("Volume inicial (m³): " + aVolume + "m³");
        aDensidade = leitura.nextDouble();
        System.out.println("Densidade inicial (kg/m³): " + aDensidade + "kg/m³");
        aAltura = leitura.nextDouble();
        System.out.println("Altura inicial (m): " + aAltura + "m");
        leitura.close();

        imc = aMassa/(aAltura*aAltura);
        System.out.println("IMC: " + imc);

    
    }
}
