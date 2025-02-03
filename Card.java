public class Card{

    public char num;
    public char color;

    public  Card(char num, char color){
        this.num = num;
        this.color = color;
    }

    public String toString(){
        return "(" + color + " " + num +")";

    }
}