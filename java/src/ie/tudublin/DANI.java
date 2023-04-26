package ie.tudublin;

import java.util.ArrayList;
import java.util.Random;

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

	public String writeSonnet() {
		StringBuilder sonnetBuilder = new StringBuilder();
		Random rand = new Random();
	
		for (int i = 0; i < 14; i++) {
			int sentenceLength = 0;
			String sentence = "";
	
			while (sentenceLength < 8) {
				// pick a random word
				String word = words.get(rand.nextInt(words.size()));
	
				// find its follows
				ArrayList<String> follows = new ArrayList<>();
				for (int j = 0; j < words.size() - 1; j++) {
					if (words.get(j).equals(word)) {
						follows.add(words.get(j + 1));
					}
				}
	
				// if there are no follows, finish the sentence
				if (follows.size() == 0) {
					break;
				}
	
				// pick a random follow word and add it to the sentence
				String follow = follows.get(rand.nextInt(follows.size()));
				sentence += follow + " ";
				sentenceLength++;
			}
	
			// capitalize the first letter of the sentence and add it to the sonnet
			sonnetBuilder.append(Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1));
			sonnetBuilder.append("\n");
		}
	
		return sonnetBuilder.toString();

		
	}
	


}
