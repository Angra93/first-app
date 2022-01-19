package ru.itsjava.oop;

public class SmartPhone {

   private String title;  // <= зачем приват если и без нее работает?
   private int ram;
   private int memory;

    private String os;

    public void setTitle(String title) {
       this.title = title;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
    public void setOs(String os){
        this.os = os;
    }

    public String getTitle(){
        return title;
    }
    public int getRam(){
        return ram;
    }
    public int getMemory(){
        return memory;
    }
    public String getOs(){
        return os;
    }
}
