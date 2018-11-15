public class HorseRunner {
    public static void main(String[] args){
        Horse horse1 = new Mustang();
        Horse horse2 = new Mustang();
        Horse horse3 = new Mustang();

        Horse[] horses = new Horse[6];
        horses[1]=horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println();

        barn.consolidate(0);

        System.out.println(barn);
        System.out.println();
    }
}
