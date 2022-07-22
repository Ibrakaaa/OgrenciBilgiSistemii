public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int note1;


    Course(String name, String Code, String prefix, Teacher teacher){
        this.name = name;
        this.code = Code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.note1 =0;


    }
    void print(){
        System.out.println("Ders Adi: "+this.name);
        System.out.println("Kodu: "+this.code);
        System.out.println("On Ek: "+this.prefix);
        System.out.println("Ogretmeni: "+this.teacher.name);
        System.out.println("-----------------------" );
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }else{
            System.out.print("Ogretmen ve Ders Bolumleri Uyusmuyor...");
        }
    }
    void printTeacherInfo(){
        this.teacher.print();
    }

}
