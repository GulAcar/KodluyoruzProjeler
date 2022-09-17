public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int docge;

    Fighter(String name, int damage,int health,int weight, int docge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (docge >=0 && docge<=100) {
            this.docge=docge;
        }else {
            this.docge=0;
        }
    }
    int hit(Fighter foe){
        System.out.println(this.name+" => "+ foe.name+ " "+ this.damage+ " hasar vurdu");
        if (foe.isDocge()) {
            System.out.println(foe.name+" Gelen hasarı blokladı!");
            System.out.println("----------");
            return foe.health;
        }
        if (foe.health - this.damage<0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDocge(){
        double randomNumber=Math.random()*100;
        return randomNumber <= this.docge;
    }
}
