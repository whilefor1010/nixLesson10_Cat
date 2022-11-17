package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{

    final Cat Kuzja = new Cat("grrrey", 4.3, "amazing");
    final Cat Fanja = new Cat("persik", 8.4, "vellikolepniy");

    final Cat Etalon = new Cat("persik", 8.4, "vellikolepniy");


    private String eSleep = Etalon.sleep();
    private String eHunt = Etalon.hunt();
    private String eRun = Etalon.run();
    private String eCensored = Etalon.censored();

    @Test
    public void shouldSleep()
    {

        assertEquals(eSleep, Fanja.whatDoesCatDo(DayOfWeek.MON));
        assertEquals(eSleep, Fanja.whatDoesCatDo(DayOfWeek.WED));
        assertEquals(eSleep, Kuzja.whatDoesCatDo(DayOfWeek.FRI));

    }

    @Test
    public void shouldHunt()
    {

        assertEquals(eHunt, Kuzja.whatDoesCatDo(DayOfWeek.TUE));
        assertEquals(eHunt, Fanja.whatDoesCatDo(DayOfWeek.THU));
        assertEquals(eHunt, Kuzja.whatDoesCatDo(DayOfWeek.SAT));

    }

    @Test
    public void shouldRun()
    {

        assertEquals(eRun, Kuzja.whatDoesCatDo(DayOfWeek.SUN));
        assertEquals(eRun, Fanja.whatDoesCatDo(DayOfWeek.SUN));

    }

    @Test
    public void shouldEquals()
    {

        assertTrue(Fanja.equals(Etalon));
        assertTrue(Etalon.equals(Fanja));

    }

    @Test
    public void shouldCensored()
    {

        assertEquals(eCensored, Fanja.whatDoesCatDo(DayOfWeek.ALWAYS));

    }

}
