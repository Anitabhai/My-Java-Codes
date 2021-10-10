public class StaticConcept {
    static int staticVar = 4;
    int intVar = 1;

    StaticConcept ()
    {
        staticVar += 1;
        this.intVar = 3;
    }
}
