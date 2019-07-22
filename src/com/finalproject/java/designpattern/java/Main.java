
public class Main {

    public static void main(String[] args) {


    }//end main method




    private static void singletonExample() {

        System.out.println("Generating Serial Numbers");
    SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
    System.out.println("next seral = "+generator.getNextSerial());
    System.out.println("next seral = "+generator.getNextSerial());
    System.out.println("next seral = "+generator.getNextSerial());
    System.out.println("next seral = "+generator.getNextSerial());
}//end method



}//end class
