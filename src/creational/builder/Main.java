package creational.builder;

public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person.PersonBuilder("Rick",70)
                .setJob("scientist")
                .setLastName("Rickiest")
                .setLocation("Several Galaxies")
                .build();
        System.out.println(p);
    }
}
