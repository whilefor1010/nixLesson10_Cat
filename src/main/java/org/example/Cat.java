package org.example;

import java.util.Objects;

public class Cat extends Predator{

    private String breed;

    public Cat(String color, double weight, String breed) {
        super(color, weight);
        this.breed = breed;
    }

    public String whatDoesCatDo(DayOfWeek day){

        String res = "";

        switch (day){
            case MON, WED, FRI  -> res = sleep();
            case TUE, THU, SAT  -> res = hunt();
            case SUN            -> res = run();
            default             -> res = censored();
        }

        return res;

    }

    public String run(){
        return "Тыгыдык!";
    }

    public String censored(){
        return "cat <censored>";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;

        if (this.hashCode()!=cat.hashCode()){
            return false;
        }

        return breed.equals(cat.breed)
                && getWeight() == cat.getWeight()
                && getColor().equals(cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(((int) getWeight()+breed.length())*17);
    }


}
