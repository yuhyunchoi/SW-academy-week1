public class Playground {
    public static void main(String[] args){
        Unit m1 = new Marine(10, 1, "Marine 1");
        Unit m2 = new Marine(10,2,"Marine 2");
        Unit z1 = new Zealot(20,3,"Zealot 1");
        Unit ze1 = new Zergling(5,4, "Zergling 1");
        Unit hydra = new Hydra(7,6,"Hydra 1");
        Unit med1 = new Medic(10,2,"Medic 1");

        Unit[] units = {m1, m2, z1, med1, hydra};

        for(Unit u : units){
            if(u instanceof Attackable){
                ((Attackable)u).attack(ze1);
            }
        }
        
    }
    
}
