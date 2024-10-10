public class Zealot extends Unit implements Attackable {
    public Zealot(int hp, int location, String name){
        super(hp, location, name);
    }
    @Override
    public void attack(Unit subject){
        System.out.println(this.name + "이 " + subject.toString() + "을 사시미 어택을 합니다.");
        subject.reductHp();
    }
    @Override
    public void move(int location){
        System.out.println("걸어갑니다");
        this.location = location;

    }
}