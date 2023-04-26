package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;
    
    public Word(String word, ArrayList<Follow> follows) {
        this.word = word;
        this.follows = follows;
    }
    
    public String getWord() {
        return word;
    }
    
    public ArrayList<Follow> getFollows() {
        return follows;
    }
    
    
}

