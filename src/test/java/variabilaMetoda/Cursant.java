package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    // In Java orice concept trebuie regasit in interiorul unei clase!
    //Clasa = Sablon care contine variabile si metode
    //Variabila = Atributul/proprietatea unei clase
    //Variabilele sunt de doua feluri: globala sau locala.
    //Variabila globala: este vizibila peste tot.
    //Structura variabila globala = public, tip variabila: (string, integer, boolean, double, float), nume varianila
    //Nu este NECESAR sa dam o valoare la o variabila.
    //Metoda= actiune/instructiune a unei clase.
    //Metodele sunt de doua feluri: cu "void" si cu "return".
    //Diferenta dintre " DOUBLE" si " FLOAT" = "DOUBLE(64 bits)", "FLOAT" (32 bits).
    //Mai exista un tip de data pentru reprezentarea valorilor cu punct: "DECIMAL"(128 bits).
    // Variabila locala = este vizibila doar in locul in care ai declarat-o.

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character gen;
    public Boolean areBursa;

    @Test
    public void initializareVariabile() {
        nume = "Sopoteanu";
        prenume = "Catalina";
        varsta = 30;
        adresa = "Craiova, Strada. Lunga, nr. 7";
        inaltime = 1.63;
        greutate = 66.645f;
        gen = 'F';
        areBursa = true;

        //Print-ul= afiseaza si ramane pe randul curent
        //Println - afiseaza si sare la randul urmator

        System.out.print(nume + " ");
        System.out.print(prenume + " ");
        System.out.println(varsta + " ");
        System.out.println(adresa);
        System.out.println(inaltime);

        calculMatematic();
        varibilaLocala();
        Double salariuActual= getSalariu();
        Double extraProcent = (salariuActual *10)/100;
        Double noulSalariu = salariuActual + extraProcent;
        System.out.println("Noul meu salariu este:" + noulSalariu + ".");
    }
    public void calculMatematic()
    {
        System.out.println("Numele cursantului este: " + nume);
        System.out.println("Greutatea cursantului:" + greutate);
        System.out.println("Genul cursantului este:" + gen);
        System.out.println("Cursantul are bursa" + areBursa);

    }

    public void varibilaLocala()
    {
        Integer numarulUnu= 45;
        Integer numarulDoi= 89;
        Integer suma= numarulUnu + numarulDoi;

        System.out.println("Suma este: " + suma);
    }

    public Double getSalariu()
    {
        return 45.12;
    }
}
