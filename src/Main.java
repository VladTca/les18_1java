public class Main {
    public static void main(String[] args) {
        Team team = new Team(5);
        team.add(new Person("jack",30));
        team.add(new Person("jack1",31));
        team.add(new Person("jack2",32));

        team.print();

        System.out.println("---------------------");
        Team team1 = new Team(1000);
        team1.add(new Person("john",30));
        team1.add(new Person("john1",30));
        team1.add(new Person("john3",30));
        team1.add(new Person("john2",30));
        team1.add(new Person("john4",30));
        team1.add(new Person("john5",30));
        team1.add(new Person("jack6",30));
        team1.print();


        //-----------------------------------------------------------------------
        System.out.println(team1.size());
        System.out.println(team1.get(2));
        System.out.println(team1);
    }
}
