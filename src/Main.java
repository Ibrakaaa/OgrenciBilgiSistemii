public class Main{
        public static void main(String[] args){
                Teacher t1 = new Teacher("XXX Hoca","ING","148");
                t1.print();
                Teacher t2 = new Teacher("YYY Hoca","EDB","149");
                t2.print();
                Teacher t3 = new Teacher("ZZZ Hocaa","MAT","150");
                t3.print();


                Course l1 = new Course("Ingilize","ING101","ING",t1);
                l1.print();
                Course l2 = new Course("Edebiyat","EDB101","EDB",t2);
                l2.print();
                Course l3 = new Course("Matematik","MAT101","MAT",t3);
                l3.print();

                Student s1 = new Student("Ahmet","1",48,l1,l2,l3);
                s1.printName();
                s1.addBulkExamNote(80,50,100,55,96,0);
                s1.printNote();
                s1.calcAvarage();
                s1.isPass();

                Student s2 = new Student("Ayse","1",65,l1,l2,l3);
                s2.printName();
                s2.addBulkExamNote(85,46,89,85,100,96);
                s2.printNote();
                s2.calcAvarage();
                s2.isPass();

                Student s3 = new Student("Taner","1",85,l1,l2,l3);
                s3.printName();
                s3.addBulkExamNote(75,68,80,85,75,92);
                s3.printNote();
                s3.calcAvarage();
                s3.isPass();






        }


}