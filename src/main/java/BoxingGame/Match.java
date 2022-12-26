package BoxingGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void run(){
        while (true){
            if (checkWeight()){
                int random = whoFirst();
                System.out.println("==============New Round=================");
                if (random<50 && random >=0){
                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " Health: " + f2.health);
                    if (f2.health <= 0){
                        f2.health =0;
                        System.out.println(f2.name + " K.O");
                        break;
                    }

                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " Health: " + f1.health);
                    if (f1.health <= 0){
                        f1.health =0;
                        System.out.println(f1.name + " K.O");
                        break;
                    }

                }
                else {

                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " Health: " + f1.health);
                    if (f1.health <= 0){
                        f1.health =0;
                        System.out.println(f1.name + " K.O");
                    break;
                    }
                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " Health: " + f2.health);
                    if (f2.health <= 0){
                        f2.health =0;
                        System.out.println(f2.name + " K.O");
                        break;
                    }
                }
            }
            else{
                System.out.println("Diffrent weight category!");
                break;
            }

        }

    }

    boolean checkWeight() {
        return (f1.weight<=maxWeight && f1.weight>=minWeight) && (f2.weight>=minWeight && f2.weight<=maxWeight);

    }
    int whoFirst(){
        int random = (int) (Math.random()*100);
        return random;
    }

}
