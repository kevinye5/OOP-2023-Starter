package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

    private ArrayList<String> words; //stores all words in the document

    public void setup() {
        colorMode(HSB);
        loadFile("small.txt"); // load the text file
        printModel(); // print the loaded model to the console

    }

    public DANI() {
        this.words = new ArrayList<>(); //constructor
    }

    public void loadFile(String filename) {
        String[] lines = loadStrings(filename); // loads the textfile into string array
        for (String line : lines) {
            String[] tokens = split(line, ' '); //splits in an array of words instead of lines
            for (String token : tokens) {
                String word = token.replaceAll("[^\\w\\s]", ""); //removes any punctuation
                if (word.length() > 0) {
                    word = word.toLowerCase(); //switches the start of the words to lower
                    if (!findWord(word)) {
                        this.words.add(word);
                    }
                }
            }
        }
    }


    public boolean findWord(String str) {
        return this.words.contains(str); //see if the word exists in array with contain function
    }


    public void printModel() {
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }


    public void settings() {
        size(1000, 1000);
        //fullScreen(SPAN);
    }

    String[] sonnet;

    public String[] writeSonnet() {
        return null;
    }


    public void keyPressed() {

    }

    float off = 0;

    public void draw() {
        background(0);
        fill(255);
        noStroke();
        textSize(20);
        textAlign(CENTER, CENTER);

    }


}
