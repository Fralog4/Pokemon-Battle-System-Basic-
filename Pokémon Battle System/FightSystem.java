public class FightSystem{
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private int round;

    public FightSystem(Pokemon thepokemon1, Pokemon thepokemon2){   //contructor
        pokemon1=thepokemon1;
        pokemon2=thepokemon2;
        round=1; //initialize the round at value 1
    }
    public static void startFight(Pokemon p1, Pokemon p2) { //use the pokemon of makePokemon
        FightSystem fightSystem = new FightSystem(p1, p2);
        fightSystem.startFight();
    }
    public void startFight() {
        System.out.println("***Inizia il combattimento!***");   //trust me with these stars * is much better in the terminal
        System.out.println("I Pokémon combattenti sono:");
        System.out.println(pokemon1.getName()); //print the name of the two fighting pokémon 
        System.out.println(pokemon2.getName());
        while(!isFinished()){   //until it's not done
            System.out.println("***Inizia il round "+round+"***");
            System.out.println("Attacco di "+pokemon2.getName()+" "+pokemon2.getAttack());
            System.out.println("Difende "+pokemon1.getName()+" "+pokemon1.getDefence());
            System.out.println(pokemon1.getName() + " rimanente con " + pokemon1.getHealth() + " punti salute!");
            AttackAndDefend(pokemon2, pokemon1);    //call the method with the pokemons as argument 
            nextRound();    //call the method to increment the round
        }
        endFight(); //if it's done end the fight
    }
    public void endFight() {
        System.out.println("***Il combattimento è terminato!***");
        System.out.println("Il vincitore è:");
        System.out.println(getWinner());    //print who wins the fight 
    }

    public void nextRound() {   //a method to increment the numbers of round
        if(!isFinished()){
            round++;    //increment the round 
    }
    }

    public boolean isFinished() {   //checker to see if the battle is finished or not yet
        return !pokemon1.Alive() || !pokemon2.Alive();  //this determins when the battle is done, when one of the pokemon isn't alive anymore
    }
    
    public Pokemon getWinner() {
        if (pokemon1.Alive()) { //the winner should be the one still alive
            return pokemon1;
        } else {
            return pokemon2;
        }
    }
    public void AttackAndDefend(Pokemon attacker, Pokemon defender) {
            // Calculate the damage done
            int danni = attacker.getAttack();
            // Reduce the defence due to damage
            defender.setHealth(defender.getHealth() - danni);
            // Check if either Pokémon is defeated
            if(!attacker.Alive() || !defender.Alive()){
                endFight();
            }
    }
}