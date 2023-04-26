package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;
    
    public Word(String word, ArrayList<Follow> follows) {
        this.word = word;
        this.follows = follows;     //constructor
    }
    
    public String getWord() {
        return word;        //assessor
    }
    
    public ArrayList<Follow> getFollows() {
        return follows; // assessor
    }

    public Follow findFollow(String str) {
        for (Follow follow : this.follows) {
            if (follow.getWord().equals(str)) {
                return follow;
            }
        }
        return null;
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(word).append(": ");
        for (Follow follow : follows) {
            builder.append(follow.toString()).append(", ");
        }
        return builder.substring(0, builder.length() - 2); //the minus 2 stops the trailing comma and space from being counted
    }

    
}

