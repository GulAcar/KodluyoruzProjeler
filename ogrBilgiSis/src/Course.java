public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        int note=0;

    }
    void addTeacher(Teacher teacher){
        this.teacher=teacher;
        if (teacher.branch.equals(this.prefix)) {
            this.teacher=teacher;
        }
        else{
            System.out.println("ogretmen ve ders bolumlerı uyusmuyor");}
        printTeacherInfo();
    }
    void printTeacherInfo(){
        this.teacher.print();
    }

}
