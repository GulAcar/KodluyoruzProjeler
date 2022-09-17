public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    int tax(int salary) {
        int vergi;
        if (salary>1000) {
            vergi = (salary * 3) / 100;
            return vergi;
        }
        else if (this.salary < 1000 && this.salary > 0) {
            vergi = this.salary;
            return vergi;
        } else {
            return 0;
        }
    }

    int bonus(int workHours) {
        int bonusUcret;
        if (workHours <= 40) {
            bonusUcret=0;
            return bonusUcret;
        }
        else if (workHours > 40) {
            workHours -= 40;
            bonusUcret = workHours * 30;
            return bonusUcret;
        }else
            return 0;
    }
    int raiseSalary(int hireYear){
        int year= 2022;
        int workYear;
        int zam;
        workYear=(year-this.hireYear);
        if (workYear<10 && workYear>0) {
            System.out.println("Alınan zam %5.");
            zam=(salary*5)/100;
            return zam;
        } else if (workYear>9 && workYear<20) {
            System.out.println("Alınan zam %10.");
            zam=(salary*10)/100;
            return zam;
        } else if (workYear>19) {
            System.out.println("Alınan zam %15.");
            zam=(salary*15)/100;
            return zam;
        }else
            return 0;
    }
    void toString1(){
        int topMaas;
        System.out.println("Çslışsnın Adı:"+this.name);
        System.out.println("Çalışanın Maaşı: "+this.salary);
        System.out.println("Çalışanın Çalışma Saati: "+this.workHours);
        System.out.println("Çalışanın İşe Başlangıç Yılı: "+this.hireYear);
        System.out.println("----------------");
        System.out.println("Çalışanın Verdiği Vergi: "+tax(salary));
        System.out.println("----------------");
        System.out.println("Çalışanın Aldığı Bonus Ücret: "+bonus(workHours));
        System.out.println("----------------");
        System.out.println("Çalışanın Aldığı Zam: "+raiseSalary(hireYear));
        System.out.println("----------------");

        topMaas=this.salary+bonus(workHours)+raiseSalary(hireYear)-tax(salary);
        System.out.println("Toplam alınan Maaş: "+topMaas);

    }

}
