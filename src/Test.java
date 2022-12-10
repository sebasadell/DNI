public class Test {
    public static void main(String[] argv) {
        DNI dni = new DNI();
        System.out.println(dni);

        DNI aDNI = new DNI(20494645);
        System.out.println(aDNI);
        aDNI.setLetter('N');
        System.out.println(aDNI);

        DNI aDNI2 = new DNI(73377313, 'E');
        System.out.println(aDNI2.toFormattedString());

        DNI aDNI3 = new DNI(-1);
        System.out.println(aDNI3.correctDNI());

        DNI aDNI4 = new DNI("44885672E");

        System.out.println(aDNI4.correctDNI());
        System.out.println(aDNI4.getNumber());
        System.out.println(aDNI4.getLetter());
    }
}