public class Marine extends Unit implements Attackable {
    public Marine(int hp, int location, String name){
        super(hp, location, name);
    }

    @Override
    public void attack(Unit subject){
            System.out.println(this.name + "이 " + subject.toString() + "을 기관총으로 쏩니다.");
            subject.reductHp();
    }
    @Override
    public void move(int location){
        System.out.println("걸어갑니다");
        this.location = location;
    }
}
