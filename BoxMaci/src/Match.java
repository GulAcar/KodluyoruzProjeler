public class Match {
    Fighter f1;
    Fighter f2;
    int minweight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight, int maxWeight /*true da yazılabilir*/){
        this.f1=f1;
        this.f2=f2;
        this.minweight=minWeight;
        this.maxWeight=maxWeight;

    }
    void run(){
        if (isCheck()) {
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("!! YENİ ROUND !!");
                f2.health=f1.hit(f2);
                if (isWin()) {
                    break;
                }
                f1.health=f2.hit(f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name+ " Sağlık:"+this.f1.health);
                System.out.println(this.f2.name+ " Sağlık:"+this.f2.health);
                System.out.println("        ");
            }
        }
        else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }
    boolean isCheck(){
        return((this.f1.weight>=minweight && this.f1.weight<=maxWeight) &&
                (this.f2.weight>=minweight && this.f2.weight<=maxWeight));

    }
    boolean isWin(){
        if (this.f1.health==0) {
            System.out.println(this.f2.name+" Kazandı !!");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" Kazandı !!");
            return true;
        }
        else
            return false;
    }
}
