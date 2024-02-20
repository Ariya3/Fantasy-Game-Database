//a utility class that creates a player object(mage or fighter) from a parsable string

public class PlayerParser{
    private static PlayerEntity newPlayer;

    public static PlayerEntity parseNewPlayer(String lineToParse){
        // local variables
        String playerType;
        int health;
        String name;
        int stamina;
        int attack;
        String weapon;
        double mana;
        boolean isRanged = true;
        String fighterType;
        
        //creates and splits string into array
        String[] tokenArray = new String[7];
        tokenArray = lineToParse.split("/");

        playerType = tokenArray[0];

        if(playerType.equalsIgnoreCase("Mage")){ //creates new mage player

            health = Integer.parseInt(tokenArray[1]);
            name = tokenArray[2];
            stamina = Integer.parseInt(tokenArray[3]);
            attack = Integer.parseInt(tokenArray[4]);
            weapon = tokenArray[5];
            mana = Double.parseDouble(tokenArray[6]);

            newPlayer = new Mage(health, name, stamina, attack, weapon, mana);
            

        }else if(playerType.equalsIgnoreCase("Fighter")){ //creates new fighter player
            health = Integer.parseInt(tokenArray[1]); 
            name = tokenArray[2];
            stamina = Integer.parseInt(tokenArray[3]);
            attack = Integer.parseInt(tokenArray[4]);
            weapon = tokenArray[5];
            fighterType = tokenArray[6];

            if(fighterType.equalsIgnoreCase("Range")){
                isRanged = true;
            } else if(fighterType.equalsIgnoreCase("Melee")){
                isRanged = false;
            }
           
            newPlayer = new Fighter(health, name, stamina, attack, weapon, isRanged);
        }

        return newPlayer;

    }
}