package fr.imie.asciiart.letter;



import java.util.ArrayList;

public class AsciiL extends AsciiBase
{
    public AsciiL() {
        this.name = 'L';
        this.letter1 = generateletter1();
        this.letter2 = generateletter2();
    }

    public ArrayList<String> generateletter1() {
        ArrayList<String> letter = new ArrayList<>();
        letter.add("#   ");
        letter.add("#   ");
        letter.add("#   ");
        letter.add("#   ");
        letter.add("### ");
        return letter;
    }

    public ArrayList<String> generateletter2() {
        ArrayList<String> letter = new ArrayList<>();
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("###### ");
        return letter;
    }
}
