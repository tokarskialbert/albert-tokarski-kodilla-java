package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
       String myText = poemDecorator.decorate(text);
       System.out.println(myText);

       return myText;
    }
}
