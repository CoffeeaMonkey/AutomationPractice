package structuri;

import org.testng.annotations.Test;

public class Matematica {

    //Structurile sunt de doua feluri: alternative si repetitive.
    //Structuri alternative: if.. then, else, si switch case
    //Structuri repetitive: for, while.

    @Test
    public void metodaTest(){
        nrMaiMareCaCinci();
        nrMaiMareCaCinciv2(9);
        nrMaiMareCaCinciv2(3);
        nrMaiMareCaCinciv3( 10 ,  3);
        nrMaiMareCaCinciv3( 3 ,  11);
       // ziDinSaptamana();

    }

   public void nrMaiMareCaCinci()
    {
        Integer nr = 9;
        if( nr > 5)
        {
            System.out.println( "Noua e mai mare ca cinci");

        }
        else {

            System.out.println("Cinci e mai mare decat noua");
             }
    }

    public void nrMaiMareCaCinciv2( Integer nr )
    {
        if( nr > 5)
        {
            System.out.println( nr + " e mai mare ca 5");

        }
        else {

            System.out.println("5 e mai mare decat " + nr);
        }
    }

    public void nrMaiMareCaCinciv3( Integer nr, Integer conditie )
    {
        if( nr > conditie)
        {
            System.out.println( nr + " e mai mare decat "+ conditie);

        }
        else {

            System.out.println( conditie + " e mai mare decat " + nr);
        }
    }

    public void ziDinSaptamana( String zi){
        switch (zi){
            case "Luni":
                System.out.println("Luni nu am sedinta.");
                break;
            case "Marti":
                System.out.println("Marti ma duc la plaja.");
                break;
            case "Miercuri":
                System.out.println("Miercuri am o zi plina");
                break;
        }
    }
}

