package BoxingGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge>=0 && dodge<=100)
        this.dodge = dodge;
        else dodge = 0;
    }

    int hit(Fighter foe){

        if (!isDodge()){
            if (foe.health-this.damage>=0){
                System.out.println(this.name + " Hit" + this.damage);
                return foe.health - this.damage;
            }
            else return 0;
        }
        else{
            System.out.println(foe.name + " Dodged!!!!");
            return foe.health;
        }


    }
    boolean isDodge(){
        double random = (Math.random() * 100);
        if (dodge>=random){
            return true;
        }
        else return false;
    }
}
