import java.util.LinkedList;
public class game {
    private LinkedList<Player> players;
    private deck discards;
    private Deck unused;

    public game( int numberOfPlayers){
        players = new LinkedList<Player>;
        discards = new deck(true);
        unused = new deck(false);
        unused.shuffle;
        for(int i = 0; i< numberOfPlayers; i++){
            Player p = new Player();
            for(int j = 0; j<7; j++){
                p.addCard(unused.getTop());
            players.add(p);    
            }
        }
        discards.add(unused.getTop());
    }

    public void show(){
        System.out.println("top card: " + discards.seeTop());
        System.out.println()
    }
    
}
