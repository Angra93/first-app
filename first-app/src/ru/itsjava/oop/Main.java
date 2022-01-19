package ru.itsjava.oop;

public class Main {

    public static void main(String[] args) {

        Man vova = new Man("Vova", 29);


        vova.sayHello();

        Lion simba = new Lion();


        Lion nala = new Lion("Nala");

        Lion shram = new Lion("Shram ");
        Lion mufasa = new Lion("Mufasa ");

        simba.sayR();
        nala.sayR();

        shram.sayR();
        mufasa.sayR();

        simba.setName("Симба");
        String simbaName = simba.getName();
        System.out.println(simbaName);

        simba.setName("Король Симба");
        System.out.println("simba.getName() = " + simba.getName());

        vova.setName2("Vova");
        String vovaName = vova.getName2();
        System.out.println(vovaName);

        vova.setName2("Vova Ivanov");
        System.out.println("vova.getName2() = " + vova.getName2());

        Iron tefal = new Iron("Tefal ", 2400, 190, 270);


        tefal.setTitle("Tefal");
        tefal.setPower(2000);
        tefal.setWeight(200);
        tefal.setWaterTank(300);

        System.out.println("tefal.getTitle() = " + tefal.getTitle());
        System.out.println("tefal.getPower() = " + tefal.getPower());
        System.out.println("tefal.getWeight() = " + tefal.getWeight());
        System.out.println("tefal.getWaterTank() = " + tefal.getWaterTank());


        System.out.println();

        SmartPhone smartPhone = new SmartPhone();

        smartPhone.setTitle("Samsung");
        smartPhone.setRam(32);
        smartPhone.setMemory(240);
        smartPhone.setOs("Android_15");

        System.out.println("smartPhone.getTitle() = " + smartPhone.getTitle());
        System.out.println("smartPhone.getRam() = " + smartPhone.getRam());
        System.out.println("smartPhone.getMemory() = " + smartPhone.getMemory());
        System.out.println("smartPhone.getOs() = " + smartPhone.getOs());


        simba.sayMeow();

        Cat bagira = new Panther();

        bagira.sayMeow();
    }

}
