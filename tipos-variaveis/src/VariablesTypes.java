public class VariablesTypes {
    public static void main(String[] args) throws Exception {

        final double VALUE_OF_PI = 3.14;

        short shortNumber = 1;
        int ordinaryNumber = shortNumber;
        short shortNumber2 = (short) ordinaryNumber;

        System.out.println("shortNumber: "+shortNumber);
        System.out.println("ordinaryNumber: "+ordinaryNumber);
        System.out.println("shortNumber2: "+shortNumber2);

        System.out.println("VALUE_OF_PI: "+VALUE_OF_PI);

    }
}



//https://help.ubuntu.com/community/KVM/Installation