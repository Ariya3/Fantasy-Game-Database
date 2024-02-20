// extends PlayerEntity class, represents a player who can cast spells

import java.text.DecimalFormat;

public class Mage extends PlayerEntity {
    //instance variables, also inherits variables from PlayerEntity
    private double mana;

    //constructors
    public Mage(){
        super();

        mana = 0.25;
    }

    public Mage(double health, String name, int stamina, int attack, String weapon, double mana){
        super(health, name, stamina, attack, weapon);

        this.mana = mana;
    }

    //abstract method definition
    public void computeCombatPower(){
        combatPoints = (int)((attack + health) * (1 + mana));

        if(weapon.equals("Staff")){
            combatPoints += 30;
        }
    }

    //accessors
    public double getMana(){
        return mana;
    }

    //toString()
    public String toString(){
        String result = "";
        DecimalFormat fmt = new DecimalFormat("0.##%");  //converts to percent

        result += "\nMage Hero:\n" + 
                  super.toString() + 
                  "Mana:\t\t\t" + fmt.format(mana) + "\n";
        
        return result;
    }
}