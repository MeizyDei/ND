import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Sukurkite programą, registruojančią į parkavimo aikštelę atvykstančius ir
        išvykstančius automobilius.
        1. Vartotojui įvedus inKLM056, atvažiavusio automobilio numeris būtų
        įrašomas į atvykusių automobilių sąrašą.
        2. Vartotojui įvedus outKLM056, išvažiavusio automobilio numeris būtų įrašomas į
        išvykusių automobilių sąrašą.
        3. Kiekvieną kartą įvedus naują automobilį turi būti išvedama:
        1. Visų kada nors įvažiavusių automobilių numeriai.
        2. Visų kada nors išvažiavusių automobilių numeriai.
        3. Kiek automobilių šiuo metu stovi aikštelėje.
        4. Visų šiuo metu aikštelėje stovinčių automobilių numeriai.
        5. Kuris, aikštelėje esantis automobilis, stovi trumpiausiai.
        6. Kuris, aikštelėje esantis automobilis, stovi ilgiausiai.
        7. Bandant išvažiuoti automobiliui, kurio nėra aikštelėje (sakykime įvyko numerio
        nuskaitymo klaida) turi būti spausdinamas klaidos pranešimas.
        8. Bandant įvažiuoti į aikštelę automobiliui, su aikštelėje jau esančio automobilio
        numeriais (sakykime įvyko numerio nuskaitymo klaida) turi būti spausdinamas
        klaidos pranešimas.
         */
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> atvykstantysAutomobiliai = new ArrayList<>();
        ArrayList<String> isvykstantysAutomobiliai = new ArrayList<>();

        System.out.println("Parkavimo aiksteles automobiliu registravimo programa.");
//        System.out.println("iveskite Automobilio numeri");
        String numeris = gautiAutomobilioNumeri(scanner);
        boolean testiPrograma = true;
            if (numeris.substring(0, 2).equals("in")) {
                atvykstantysAutomobiliai.add(numeris);
            } else if (numeris.substring(0, 3).equals("out")) {
                isvykstantysAutomobiliai.add(numeris);
            } else {
                System.out.println("Klaida! Pries numerio kombinacija iveskite in/out");
            }
    }
    public static int meniu(Scanner scanner){
        System.out.println("[1] - Įvažiavimas\n" +
                            "[2] - Išvažiavimas\n");
        return 0;
    }
    public static int skPasirinkimas(Scanner scanner, int[] leistinosReiksmes){
        int pasirinkimas = 0;
        boolean neivesta = true;
        while(neivesta){
            String ivestiDuomenys = scanner.next();
            try{
                pasirinkimas = Integer.parseInt(ivestiDuomenys);
                if(leistinosReiksmes.length == 0 || arSkaiciusYraSarase(leistinosReiksmes, pasirinkimas)){
                    neivesta = false;
                }else{
                    System.out.println("Nezinoma komanda");
                }
            }catch(NumberFormatException nfe){
                System.out.println("Klaida!");
            }
        }
        return pasirinkimas;
    }
    public static boolean arSkaiciusYraSarase (final int[] skaiciuSarasas, final int skaicius){
        boolean result = false;
        for(int i : skaiciuSarasas){
            if(i == skaicius){
                result = true;
                break;
            }
        }
        return result;
    }
    private static String gautiAutomobilioNumeri(Scanner scanner) {
        System.out.println("iveskit auto numeri");
        String autoNumeris = scanner.nextLine();
        return autoNumeris;
    }

}

