import java.awt.*;

public class Teacher {
    String name;
    String branch;
    String mpno;


    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;

    }
    void print(){
        System.out.println("------------------------------");
        System.out.println("Ogretmen Adi: "+this.name);
        System.out.println("Bolumu: "+this.branch);
        System.out.println("Numarasi: "+this.mpno);
        System.out.println("------------------------------");
    }




}
