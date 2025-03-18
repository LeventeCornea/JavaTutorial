package finalKeyword;

import org.testng.annotations.Test;

public class FinalTest {

    //Variabila = proprietate care isi poate modifica valoarea
    //Constanta = proprietate care nu isi poate modifica valoarea
    //Scopul unei constante poate sa fie acela de a pastra aceleasi valori in intreg proiectul

    public final String user = "AdrianNastase";
    public final String password = "jelszo";

    @Test
    public void loginTest(){
        System.out.println("Userul s-a logat cu succes folosind user: " + user + " si parola: " + password);
    }
}
