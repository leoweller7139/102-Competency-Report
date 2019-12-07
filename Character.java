public class Character{
    private String name;
    private int energy;
    private int lives;
    private int attackPoints;

    // constructor
    public Character(String name, int energy, int attackPoints){
        this.name=name;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.lives= 3;
    }

    // getters

    // methods (Attack and Defend)
    public String getName(){
        return this.name;
    }

    public int getEnergy(){
        return this.energy; 
    }

    public int getLives(){
        return this.lives;
    }

    public int getAttackPoints(){
        return this.attackPoints;
    }
    
    // Methods
    public void display(){
        System.out.println("------------------------ ");
        System.out.println("Name: " + this.name);
        System.out.println("Lives: " + this.lives);
        System.out.println("Energy: " + this.energy);
        System.out.println("Attack Points: " + this.attackPoints);
    }

    public void attack(Character opponent){
        System.out.println(this.name + " is attacking ... " + opponent.name);

        int newLP = opponent.energy-this.attackPoints;

        opponent.energy=newLP;
        opponent.display();

        if(opponent.energy <= 0){
            opponent.lives=opponent.lives-1;
            opponent.display();
            opponent.energy=100;
        }

        if(opponent.lives < 1){
            System.out.println("Game Over");
            System.exit(1);
        }

    }

}