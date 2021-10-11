import java.util.ArrayList;
import java.util.List;

public class TestDriver {
    public void testPlayList() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Thriller");
        myList.add("Baby be mine");
        myList.add("Kuch kuch hota hai");
        myList.add("You are the world");
        myList.add("Shokhi bhabona kahare koi");
        myList.add("Kal ho na ho");
        myList.add("Amaro porano jaha chai");
        Playlist myObj = new Playlist();
        myObj.reverseOrder(myList);
    }

    public void testControlLoop() {
        ControlLoops myLoop = new ControlLoops();
        myLoop.doLoops();
    }

    public void testStringExercise() {
        StringExercise myStringExercise = new StringExercise();
        myStringExercise.evenOdd();
    }

    public void testDataTypes() {
        DataTypes myDataType = new DataTypes();
        myDataType.doDataTypes();
    }

    public void testReverseArray() {
        ReverseArray myReverseArray = new ReverseArray();
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(4);
        myNumbers.add(7);
        myNumbers.add(8);
        myNumbers.add(10);
        myReverseArray.doReverseArray(myNumbers);
    }

    public void testPrimeDetective() {
        PrimeDetective myPrimeDectective = new PrimeDetective();
        myPrimeDectective.isPrime(7);
        myPrimeDectective.isPrime(28);
        myPrimeDectective.isPrime(29);
        myPrimeDectective.isPrime(0);
        myPrimeDectective.isPrime(2);
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        myPrimeDectective.onlyPrime(numbers);
        myPrimeDectective.oddOrEven(numbers, true);
        myPrimeDectective.oddOrEven(numbers, false);
        myPrimeDectective.oddEven(numbers, true);
        myPrimeDectective.oddEven(numbers, false);

    }

    public void testBank() {
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.name);
        bankOfGods.accountOne.addFunds(5);
        bankOfGods.accountOne.getInfo();
    }

    public void testStaticConcept() {
        StaticConcept myObject = new StaticConcept();
        System.out.println("Static variable called with class is: " + StaticConcept.staticVar);
        System.out.println("Not static variable is: " + myObject.intVar);
    }

    public void testStringArrangement() {
        StringArrangement myResult = new StringArrangement();

        ArrayList<String> myRepo = new ArrayList<String>();

        myRepo.add("mobile");
        myRepo.add("mouse");
        myRepo.add("Moneypot");
        myRepo.add("monitor");
        myRepo.add("mousePad");
        myRepo.add("addition");

        String myQuery = "mouse";

        List<ArrayList<String>> allWords = new ArrayList<ArrayList<String>>();

        allWords = myResult.searchSuggestions(myRepo, myQuery);

        allWords.forEach((list) ->
        {
            System.out.println("for the allWords list " + list);
            list.forEach((word) -> System.out.println(word));
        });
    }
}
