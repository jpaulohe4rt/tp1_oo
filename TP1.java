import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {
        int mes = 1;
        int ano = 2020;
        int dia = 31;
        int[] temperaturas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,25,25,26,27,28,29,30,31};
        /* System.out.println("Digite o mes:");
            mes = new Scanner(System.in).nextInt();
           System.out.println("Digite o ano:");
           ano = new Scanner(System.in).nextInt();
           validaData(mes, ano);
          pegaTemperatura(dia); */



        int tempMin = temperaturaMinima(dia, temperaturas);
        int tempMax = temperaturaMax(dia, temperaturas);
        int tempMed = temperaturaMed(dia, temperaturas);
        menu(mes, ano, dia, tempMin, tempMax, tempMed);
    }
    
    private static void menu(int mes, int ano, int dia, int tempMin, int tempMax, int tempMed) {
        int num = 0;
        int[] temperaturas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,25,25,26,27,28,29,30,31};
        do {
            System.out.println("\n\n INMET- (Instuto Nacional de Meterologia)");
            System.out.println("1 - Entrada das temperaturas");
            System.out.println("2 - Cálculo da temperatura média");
            System.out.println("3 - Cálculo da temperatura mínima");
            System.out.println("4 - Cálculo da temperatura máxima");
            System.out.println("5 - Relatório Meterológico");
            System.out.println("0 - Sair");
            System.out.print("\n");
            num = new Scanner(System.in).nextInt();
            switch (num) {
            case 0:
                break;
            case 1:
            System.out.println("Digite o mes:");
                mes = new Scanner(System.in).nextInt();
            System.out.println("Digite o ano:");
                ano = new Scanner(System.in).nextInt();
                validaData(mes, ano);
                pegaTemperatura(dia); 
                break;
            case 2:
                temperaturaMinima(dia, temperaturas);
                break;
            case 3:
                temperaturaMax(dia, temperaturas);
                break;
            case 4:
                temperaturaMed(dia, temperaturas);
                break;
            case 5:
                relatorio(tempMax,tempMin,tempMed);
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
            }
        } while (num != 0);
    }

    public static void relatorio(int tempMax, int tempMin, int tempMed) {
        System.out.println("A media de temperatura do mes: "+ tempMed + "\n");
        System.out.println("A temperatura maxima do mes: " + tempMax + "\n");
        System.out.println("A temperatura minima do mes: " + tempMin + "\n");
    }

    public static int temperaturaMed(int dia, int temperaturas[]) {
        int tempMed = 0;
        int soma = 0;
        for(int i=0; i<dia; i++){
            soma = soma + temperaturas[i];
        }
        tempMed = soma/dia;
        System.out.println(tempMed);
        return tempMed;
    }


    public static int temperaturaMax(int dia, int temperaturas[]) {
        int tempMax = 0;
        for(int i = 0; i<dia; i++){
            if(temperaturas[i] > tempMax){
                tempMax = temperaturas[i];
            }
        }
        System.out.println(tempMax);
        return tempMax;
    }

    public static int temperaturaMinima(int dia,int temperaturas[]) {
        int i = 0;
        int tempMin = temperaturas[0];
        while (i < dia) {
            if (tempMin > temperaturas[i]) {
               tempMin = temperaturas[i];
            }
            i++ ;
         }
         System.out.println(tempMin);
        return tempMin;
    }

    public static int[] pegaTemperatura(int dia) {
        int t[] = new int [dia];
        for(int i=0;i<dia;i++){
           System.out.printf("Informe as temperaturas :", (i + 1), dia);
           t[i] = new Scanner(System.in).nextInt();
        }
        return t;
    }

    public static int validaData(int mes, int ano) {
        int dia = 0;
        if(mes >= 1 && mes <= 12) {
            // Data Válida
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
                    dia = 31;
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    dia = 30;
                } else if (mes == 2) {
                    // Se o mês é fevereiro, é necessário saber se o ano é bissexto ou não, ou seja, se fevereiro tem 28 ou 29 dias
                    if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0){
                        dia = 29;
                    } else{       
                        dia = 28;
                }
            } else {
                System.out.println("Data Inválida");
            }
        } else {
            System.out.println("Data Inválida");
        }
        return dia;
    }
    
}
