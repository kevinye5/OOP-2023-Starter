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
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(word).append(": ");
        for (Follow follow : follows) {
            builder.append(follow.toString()).append(", ");
        }
        return builder.substring(0, builder.length()); 
    }
}

