public class Mutal extends Unit implements Attackable {

    public Mutal(int hp, int location, String name){
        super(hp, location, name);
    }
    @Override
    public void attack(Unit subject){
            System.out.println(this.name + "이 " + subject.toString() + "을 공격한다.");
            subject.reductHp();
    }

    @Override
    public void move(int location){
        System.out.println("날아갑니다");
        this.location = location;
    }
    
}

    
