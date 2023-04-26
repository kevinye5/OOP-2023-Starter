package ie.tudublin;

public class Follow{

    private int count = 0;
    private String word;
    
    public Follow(String word, int count){
    
        this.word = word;
        this.count = count; //constructor
    }

    public String getWord(){
        return word;     //accessor
    }

    public int getCount(){
        return count;   //accessor
    }

    public String toString(){
        return toString();  //toString method
    }
}
