package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Cat Fanja = new Cat("persik", 8.4, "vellikolepniy");
        Cat Kuzja = new Cat("grrrey", 4.3, "amazing");

        System.out.println("Fanja = Kuzja:" + Fanja.equals(Kuzja));

        System.out.println(Fanja.whatDoesCatDo(DayOfWeek.MON));
        System.out.println(Fanja.whatDoesCatDo(DayOfWeek.TUE));
        System.out.println(Fanja.whatDoesCatDo(DayOfWeek.ALWAYS));
        System.out.println(Fanja.whatDoesCatDo(DayOfWeek.SUN));

    }
}
