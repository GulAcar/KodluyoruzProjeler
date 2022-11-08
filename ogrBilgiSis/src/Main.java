public class Main {
    public static void main(String[] args) {

        Teacher t1=new Teacher("Mahmut Hoca","TRH","555");
        Teacher t2=new Teacher("Ali Hoca","FZK","444");
        Teacher t3=new Teacher("Ahmet Hoca","BIY","333");

        Course tarih=new Course("Tarih","101","TRH",t1);
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","102","FZK",t2);
        fizik.addTeacher(t2);
        Course biyo=new Course("Bİyoloji","103","BIY",t3);
        fizik.addTeacher(t3);

        Student s1=new Student("can","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,88,50);
        s1.printNote();
        s1.isPass();

        Student s2=new Student("cem","122","4",tarih,fizik,biyo);
        s1.addBulkExamNote(78,67,100);
        s1.printNote();
        s1.isPass();
    }
}