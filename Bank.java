import java.util.*;
import java.io.*;

public class Bank {
    public CheckingAccount accountOne;
    public CheckingAccount accountTwo;

    public Bank(){
        accountOne = new CheckingAccount("Zeus", 100, "1");
        accountTwo = new CheckingAccount("Hades", 200, "2");
    }

}
