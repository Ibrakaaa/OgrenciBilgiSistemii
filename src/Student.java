public class Student {
    String name;
    String classes;
    int stuNo;
    Course course1;

    Course course2;
    Course course3;
    double avarage;
    boolean isPass;


    Student(String name, String classes, int stuNo, Course course1, Course course2,Course course3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;



    }
    void addBulkExamNote(int note1s,int note1y,int note2s,int note2y,int note3s,int note3y){
        if(note1s>=0 && note1s<=100){
            this.course1.note = note1s;
        }
        if(note1y>=0 && note1y<=100){
            this.course1.note1 = note1y;

        }
        if(note2s>=0 && note2s<=100){
            this.course2.note = note2s;
        }
        if(note2y>=0 && note2y<=100){
            this.course2.note1 = note2y;
        }
        if(note3s>=0 && note3s<=100){
            this.course3.note = note3s;
        }
        if(note3y>= 0 && note3y<=100){
            this.course3.note1 = note3y;
        }



        }

    void calcAvarage(){
        this.avarage = ((this.course1.note)*0.20+(this.course1.note1)*0.80 + (this.course2.note)*0.20 + (this.course2.note1)*0.80 +
        (this.course3.note)*0.20+(this.course3.note1)*0.80)/3;
        System.out.println("Ortalamaniz: "+this.avarage);




    }
    void printNote(){
        System.out.println( course1.name +" Sozlu notu: "+ this.course1.note + " , Yazili notu: "+this.course1.note1);
        System.out.println(course2.name+" Sozlu notu: "+ this.course2.note + " , Yazili notu: "+this.course2.note1);
        System.out.println(course3.name+" Sozlu notu: "+ this.course3.note + " , Yazili notu: "+this.course3.note1);
    }
    void isPass(){
        if(avarage>=55){
            System.out.println("Tebrikler Sinifi Basariyla Gectiniz.");
        }else{
            System.out.println("Uzgunum. Sinifi Gecemediniz...");
        }



    }
    void printName(){
        System.out.println("=========================");
        System.out.println("Ogrenci Ismi: "+this.name);
    }




}
