
public class makePokemon {
    public static void main(String[]args){
        Fight Lucario= new Lucario();   //create the new objects pokemons 
        Fire Charizard= new Charizard();
        Dragon Rayquaza= new Rayquaza();
        Dark Darkrai= new Darkrai();

        Pokemon[] pokemonList= new Pokemon[4];  //I have chosen to create an array to store the pokemon like the videogame team box
        pokemonList[0]= Lucario;
        pokemonList[1]= Charizard;
        pokemonList[2]= Rayquaza;
        pokemonList[3]= Darkrai;
        //I want different battles each time I run the code so i need a random pick up from my team(array)
        Pokemon p1= pokemonList[(int) (Math.random()* pokemonList.length)];  // cast to int and chose a random one in the Pokemon array
        Pokemon p2= pokemonList[(int)(Math.random()* pokemonList.length)];
        if (p1 == p2) { //I want to prevent that the pokemos involved in fighting are the same one
            p2 = pokemonList[(int) (Math.random() % pokemonList.length)];
        }
        FightSystem.startFight(p1, p2);
    }
}
