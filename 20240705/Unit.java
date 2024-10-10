public abstract class Unit {

    protected int hp;
    protected int location;
    protected String name;

    public Unit(int hp, int location, String name){
        this.hp = hp;
        this.location = location;
        this.name = name;
    };


    public void sayHi(){
        System.out.println("Go Go Go");
    }
    public void reductHp(){
        this.hp--;
    }

    abstract void move(int location);
    
    public String toString(){
        return this.hp + ", " + this.name;
    }

}
