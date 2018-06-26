public class Dog extends Animal{
    public void testmethod(){
        System.out.printf("Hello from the Animal abstract overide method\n");
    }
   
    public static void main(String[] args){
        // Prints "Hello, World"
        int c = 2;
        System.out.printf("Hello, World\n");
        System.out.printf("Value of c vairble, c = %d\n", c);
        Dog testDog = new Dog();
        testDog.testmethod();
    }
}
