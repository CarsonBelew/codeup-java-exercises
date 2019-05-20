
public class ServerNameGenerator {

    public static String[] adjectives = {"bald", "mysterious", "silly", "scary", "plump", "petite", "clumsy", "shapely", "eager", "jolly"};

    public static String[] nouns = {"bat", "tiger", "squirrel", "hand", "knee", "juice", "cheese", "chalk", "cereal", "bear"};

    public static String randomAdjective(){
        int randomAdj = (int)Math.floor(Math.random() * adjectives.length);
        return adjectives[randomAdj];
    }
    public static String randomNoun(){
        int randomN = (int)Math.floor(Math.random() * nouns.length);
        return nouns[randomN];
    }

    public static void main(String[] args) {
        System.out.println("You are a " +randomNoun()+ " that is " +randomAdjective()+ "....");
    }
}
