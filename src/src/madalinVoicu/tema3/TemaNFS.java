package madalinVoicu.tema3;


//Clasa main, in care se executa metodele si programul in sine.
public class TemaNFS {

    public static void main(String[] args) {
        NeedForSpeed masina_1 = new NeedForSpeed(12, 25);
        NeedForSpeed masina_2 = new NeedForSpeed(7, 2);
        NeedForSpeed masina_3 = new NeedForSpeed(17, 9);
        RaceTrack traseu_1 = new RaceTrack(100);
        Drive traseuMasini = new Drive();
        traseuMasini.drive();
        System.out.println("===========================================================================");
        Nitro masinaNitro = new Nitro();
        masinaNitro.nitro();
        CanFinish stadiuBaterie = new CanFinish();
        stadiuBaterie.baterieConsumata(15);


    }

}

//Definirea clasei NeedForSpeen, pentru a declara detaliile tehnice ale masinilor (viteza, consum baterie).
class NeedForSpeed {
    //    private int viteza;
    NeedForSpeed(int viteza, int consumBaterie) { //constructorul clasei NFS
//        this.viteza = 10;
        System.out.println("Viteza masinii este " + viteza + ", iar bateria consuma " + consumBaterie +
                "% la fiecare " + viteza + " metri.");
    }
}

//Definirea clasei RaceTrack, a cursei, alaturi de constructorul acesteia pentru a afisa determina distanta cursei.
class RaceTrack {
    RaceTrack(int distantaTraseu){
        System.out.println("Distanta traseului 1 este de " + distantaTraseu + " metri.");
    }
}

//Crearea clasei Drive in care avem metoda drive().
class Drive{
    //Declararea variabile in clasa Drive pt a fi folosite in metoda drive() a clasei curente.
    int viteza_masina_1 = 12, consum_baterie_masina_1 = 25;
    int viteza_masina_2 = 7, consum_baterie_masina_2 = 2;
    //    int viteza_masina_3 = 17, consum_baterie_masina_3 = 9;
    int distanta_masina_1 = 0, distanta_masina_2 = 0, distanta_masina_3 = 0;
    int baterie_ramasa_masina_1 = 100, baterie_ramasa_masina_2 = 100, baterie_ramasa_masina_3 = 100;

    //Metoda drive() - implementata pt a vedea ce masina poate ajunge la finish si care ramane fara baterie si nu termina cursa.
    public void drive() {
//Masina 1
        while (baterie_ramasa_masina_1 > 0 && distanta_masina_1 < 100){
            distanta_masina_1+=viteza_masina_1;
            baterie_ramasa_masina_1 -= consum_baterie_masina_1;
            System.out.println("Masina 1 a parcurs " + distanta_masina_1 + " metri. Aceasta mai are " +
                    baterie_ramasa_masina_1 + "% baterie ramasa");
            if (distanta_masina_1 > 100){
                System.out.println("Masina 1 a ajuns la finish!");
            }
            else if (baterie_ramasa_masina_1 == 0) {
                System.out.println("Masina 1 a ramas fara baterie si nu a ajuns la finish!");
            }
        }
//Masina 2
        while (baterie_ramasa_masina_2 > 0 && distanta_masina_2 < 100){
            distanta_masina_2+=viteza_masina_2;
            baterie_ramasa_masina_2 -= consum_baterie_masina_2;
            System.out.println("Masina 2 a parcurs " + distanta_masina_2 + " metri. Aceasta mai are " +
                    baterie_ramasa_masina_2 + "% baterie ramasa");
            if (distanta_masina_2 > 100){
                System.out.println("Masina 2 a ajuns la finish!");
            }
            else if (baterie_ramasa_masina_2 == 0) {
                System.out.println("Masina 2 a ramas fara baterie si nu a ajuns la finish!");
            }
        }


//    distanta_masina_1 += viteza_masina_1;
//    baterie_ramasa_masina_1 -= consum_baterie_masina_1;
//    distanta_masina_2 += viteza_masina_2;
//    baterie_ramasa_masina_2 -= consum_baterie_masina_2;
//    distanta_masina_3 += viteza_masina_3;
//    baterie_ramasa_masina_3 -= consum_baterie_masina_3;

    }
    //Variabile care vor prelua si stoca noile valori ale distantei si bateriei rezultate dupa executarea metodei drive(),
//pt ca mai apoi aceste valori sa fie folosite la urmatoarele iteratii ale metodei curente.
    public int distantaParcursa_1(){
        return distanta_masina_1;
    }
    public int baterieRamasa_1(){
        return baterie_ramasa_masina_1;
    }

}
class Nitro {
    public void nitro() {
        int viteza_nitro = 50;
        int consum_baterie_nitro = 4;
        System.out.println("Viteza masinii Nitro este " + viteza_nitro +
                ", iar consumul de baterie al acesteia este " + consum_baterie_nitro + "%.");
    }
}

class CanFinish extends Drive {
    public boolean baterieConsumata(int consumBaterie){
        if(consumBaterie == 0){
            System.out.println("Bateria a fost consumata! \n Masina nu poate termina cursa!");
            return false;
        }
        else{
            return true;
        }
    }

}
