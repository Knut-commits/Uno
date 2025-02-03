public class Main
{
    public static void main(String[] args) {
        Deck d = new Deck();
        Player a = new Player();

        System.out.println(a);
        System.out.println(d);
        for(int i =0 ; i< 7; i++){
            a.addCard(d.getTop());
        }
        System.out.println(a);

        
    }
}
