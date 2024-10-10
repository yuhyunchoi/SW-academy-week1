public class Medic extends Unit implements Attackable{
    public Medic(int hp, int location, String name){
        super(hp, location, name);
    }

    @Override
    public void attack(Unit subject){
            System.out.println(this.name + "은 " + subject.toString() + "을 공격 못 합니다.");
            subject.reductHp();
    }
    @Override
    public void move(int location){
        System.out.println("걸어갑니다");
        this.location = location;
    }
    
}
