package fr.imie.asciiart.letter;

import java.util.ArrayList;

public class AsciiC extends AsciiBase
{
    public AsciiC() {
        this.name = 'C';
        this.letter1 = generateletter1();
        this.letter2 = generateletter2();
    }

    public ArrayList<String> generateletter1() {
        ArrayList<String> letter = new ArrayList<>();
        letter.add(" ## ");
        letter.add("#   ");
        letter.add("#   ");
        letter.add("#   ");
        letter.add(" ## ");
        return letter;
    }

    public ArrayList<String> generateletter2() {
        ArrayList<String> letter = new ArrayList<>();
        letter.add("  #### ");
        letter.add(" #     ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add("#      ");
        letter.add(" #     ");
        letter.add("  #### ");
        return letter;
    }
}