package Mostenire;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostenireTest {
    @Test
    public void MetodaTest(){
        List<String>DotariExterioareDacia= Arrays.asList("Faruri led", "Portbagaj XL", "Motor suplimentar");

        Dacia Logan= new Dacia ("Dacia", "Logan",2022,"Verde", 9852.20, DotariExterioareDacia);
        Logan.InfoDacia();
        Logan.ReducerePret();
    }
}
