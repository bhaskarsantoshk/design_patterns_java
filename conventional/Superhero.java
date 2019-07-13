package conventional;

public class Superhero {
    private String universe;
    private String name;
    private String superPowers;
    private boolean hasGirlFriend;
    public Superhero(String universe){
        this.universe = universe;
    }
    private Superhero(String universe, String name){
        this.universe = universe;
        this.name = name;
    }
    private Superhero(String universe, String name, String superPowers){
        this.universe = universe;
        this.name = name;
        this.superPowers = superPowers;
    }
    private Superhero(String universe, String name, String superPowers, boolean hasGirlFriend){
        this.universe = universe;
        this.name = name;
        this.superPowers = superPowers;
        this.hasGirlFriend = hasGirlFriend;
    }
}
