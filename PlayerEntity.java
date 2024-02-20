// This is an abstract class that represents the basic attributes 
// of any player in the program 

public abstract class PlayerEntity {
    //instance variables 
    protected double health;
    protected String entityName;
    protected int stamina;
    protected int attack;
    protected int combatPoints;
    protected String weapon;

    //constructors
    public PlayerEntity(){
        health = 150.0;
        entityName = "none";
        stamina = 90;
        attack = 130;
        combatPoints = 0;
        weapon = "No Weapon";
    }

    public PlayerEntity(double health, String name, int stamina, int attack, String weapon){
        this.health = health;
        entityName = name;
        this.stamina = stamina;
        this.attack = attack;
        combatPoints = 0;
        this.weapon = weapon;
    }

    //abstract method
    public abstract void computeCombatPower();

    //accessors
    public double getHealth(){
        return health;
    }

    public String getName(){
        return entityName;
    }

    public int getStamina(){
        return stamina;
    }

    public int getAttack(){
        return attack;
    }

    public int getCombatPoints(){
        return combatPoints;
    }

    public String getWeapon(){
        return weapon;
    }

    //toString
    public String toString(){
        String result;

        result = "Hero name:\t\t" + entityName +
                  "\nCurrent Health:\t\t" + health +
                  "\nStamina:\t\t" + stamina +
                  "\nAttack Damage:\t\t" + attack + 
                  "\nWeapon:\t\t\t" + weapon + 
                  "\nCurrent Combat Points:\t" + combatPoints + "\n";

        return result;
    }
}