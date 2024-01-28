public abstract class Pokemon {
    private String name;    //Encapsulation
    private int Health;
    private int Attack;
    private int Defence;
    boolean isAlive;
    
    public Pokemon(String theName, int theHealth, int theAttack,int theDefence){    //constructor for the superclass pokémon
        name=theName;
        Health=theHealth;
        Attack=theAttack;
        Defence=theDefence;
        isAlive=true;
    }
    public boolean Alive() {
        return isAlive;
    }
    public String getName(){    //getters for the instance variables
        return name;
    }
    public int getHealth(){
        return Health;
    }
    public void setHealth(int H){
        Health=H;
        if(H<=0){
            isAlive=false;
        }
    }
    public int getAttack(){
        return Attack;
    }
    public int getDefence(){
        return Defence;
    }
    
}
