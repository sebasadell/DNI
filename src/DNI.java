import java.text.NumberFormat;

public class DNI {
    private int number;
    private char letter;

    public DNI(){
    }

    public DNI(int n, char c){
        number = n;
        letter = c;
    }

    public DNI(int n){
        number = n;
    }

    public DNI(String s){
        number = Integer.parseInt(s.replaceAll("[^0-9]", ""));
        letter = s.charAt(8);
    }

    public int getNumber(){
        return number;
    }

    public char getLetter(){
        return letter;
    }

    public void setLetter(char c) {
        letter = c;
    }

    public String toString(){
        return String.valueOf(number) + letter;
    }

    public String toFormattedString(){
        NumberFormat n = NumberFormat.getNumberInstance();
        return n.format(number) + "-" + letter;
    }

    public boolean correctDNI(){
        if(number < 0){
            return false;
        }
        else{
            return true;
        }
    }


}