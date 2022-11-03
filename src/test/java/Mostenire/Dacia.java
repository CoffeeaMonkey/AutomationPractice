package Mostenire;

import java.util.List;

public class Dacia extends Masina {

    private String Culoare;
    private Double Pret;
    private List <String> DotariExterioare;

    public String getCuloare() {
        return Culoare;
    }

    public Double getPret() {
        return Pret;
    }

    public List<String> getDotariExterioare() {
        return DotariExterioare;
    }

    public void setCuloare(String culoare) {
        Culoare = culoare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        DotariExterioare = dotariExterioare;
    }


    public Dacia(String marca, String model, Integer anulFabricatiei, String Culoare, Double Pret, List <String> DotariExterioare ) {
        super(marca, model, anulFabricatiei);
        this.Culoare=Culoare;
        this.Pret=Pret;
        this.DotariExterioare=DotariExterioare;

    }

    public void InfoDacia(){
        InfoMasina();
        System.out.println(" Culoarea masinii este" +Culoare);
        System.out.println(" Pretul masinii este" +Pret);
        System.out.println(" Dotarile exterioare ale masinii sunt");
         for(Integer Index=0; Index<DotariExterioare.size(); Index++){
             System.out.println(DotariExterioare.get(Index));
         }
    }

    public void ReducerePret(){
        Integer Reducere=20;
        Double  PretRedus=(Pret*20)/100;
        Pret=Pret-PretRedus;
        System.out.println("Pretul dupa reducere este" +Pret);
    }
}
