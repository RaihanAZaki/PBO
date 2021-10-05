// player
class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}

public class Latihan1YT{

    public static void main(String[] args) {
        
        // membuat object player
        Player player1 = new Player("Raihan",100);
        Player player2 = new Player("Zaki",50);

        // membuat object weapon
        Weapon tombak = new Weapon("Tombak",150);
        Weapon panah = new Weapon("Panah",142);

        // membuat object armor
        Armor bajuBaja = new Armor("Baju Baja",25);
        Armor kaosbiasa = new Armor("kaos biasa",10);
        
        // player 1
        player1.equipWeapon(tombak);
        player1.equipArmor(bajuBaja);
        player1.display();

        // player 2
        player2.equipWeapon(panah);
        player2.equipArmor(kaosbiasa);
        player2.display();
    }
}