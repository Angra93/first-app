package ru.itsjava.oop;

public class Iron {

    private String title;
    private int power;
    private int weight;
    private int waterTank;

    public Iron(String title, int power, int weight, int waterTank) {
        this.title = title;
        this.power = power;
        this.weight = weight;

        this.waterTank = waterTank;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWaterTank(int waterTank) {
        this.waterTank = waterTank;
    }

    public String getTitle() {
        return title;

    }

    public int getPower() {
        return power;
    }

    public int getWeight() {
        return weight;
    }

    public int getWaterTank(){
        return waterTank;
    }


}
