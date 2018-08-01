public class MyMath{

    // by making a private constructor the class cannot be instantiated as a new object
    private MyMath(){};
    public static int min(int a, int b){
        return ( (a < b) ? a : b );
    }
}
