// Extends PlayerEntity, represents a player in the program

import java.text.DecimalFormat;

public class Fighter extends PlayerEntity{
    //intance variables also inherits variables from PlayerEntity
    private double armor;
    private int maxAttack;
    private boolean isRanged;

    //constructors
    public Fighter(){
        super();

        armor = 0.25;
        maxAttack = 125;
        isRanged = false;
    }

    public Fighter(double health, String name, int stamina, int attack, String weapon, boolean isRanged){
        super(health, name, stamina, attack, weapon);

        this.isRanged = isRanged;

        if(isRanged){
            armor = 0.25;
            maxAttack = 125;
        } else {
            armor = 0.5;
            maxAttack = 100;
        }
    }

    //abstract method definition
    public void computeCombatPower(){
        if(maxAttack <= attack){
            combatPoints = (int)((maxAttack + health) * (1 - armor));
        } else {
            combatPoints = (int)((attack + health) * (1 - armor));
        }

        if(isRanged && weapon.equals("Rock")){
            combatPoints += 50;
        } 
        if(!isRanged && weapon.equals("Sword")){
            combatPoints = combatPoints * 2;
        }
    }

    //accessors
    public double getArmor(){
        return armor;
    }

    public int getMaxAttack(){
        return maxAttack;
    }

    public boolean getIsRanged(){
        return isRanged;
    }

    //toString
    public String toString(){
        String result = "";
        String fighterType;
        DecimalFormat fmt = new DecimalFormat("0.##%"); //converts to percent

        if(isRanged){
            fighterType = "Ranged Type";
        } else {
            fighterType = "Melee Type";
        }

        result += "\nFighter Hero:\t\t" + fighterType + "\n" +
                  super.toString() + 
                  "Armor:\t\t\t" + fmt.format(armor) + "\n";

        return result;
    }
}