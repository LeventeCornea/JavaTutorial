package finalKeyword;

import org.testng.annotations.Test;

public class FinalTest {

    //Variabila = proprietate care poate sa-si modifica valoarea
    //Constanta = proprietate care nu poate sa-si modifica valoarea
    //Scopul unei constante poate sa fie acela de a pastra aceleasi valori in intreg proiectul

    public String user = "Andrei@gmail.com";
    public String password = "123456";

    @Test
    public void loginTest(){
        System.out.println("Userul s-a logat cu succes folosing user: " + user + " parola " + password);
    }
}
