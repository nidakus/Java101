public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if(this.salary <= 1000){
            return  0;
        }else{
            return this.salary * 0.03;
        }
    }
    int bonus (){
        int sum,total = 0;
        if(this.salary <= 40){
            return 0;
        }else{
            for(int i = 41; i<= this.workHours; i++){
                sum = i%10;
                total = sum;
            }
            return total * 30;
        }
    }
    double raiseSalary(){
        int nowYear = 2021;
        int tempYear = nowYear - this.hireYear;
        if(tempYear < 10){
            return (this.salary * 0.05);
        }else if(tempYear < 20 && tempYear >= 10){
            return(this.salary * 0.1);
        }else{
            return (this.salary * 0.15);
        }
    }
    public String toString(){
        System.out.println("===================");
        return "Adi: " + this.name +"\n"+
                "Maasi: " + this.salary + " TL" + "\n"+
                "Calisma Saati: " + this.workHours + "\n"+
                "Baslangic Yili: " + this.hireYear + "\n"+
                "Vergi: " + tax() + "\n"+
                "Bonus: " + bonus() + " TL" + "\n"+
                "Maas Artisi: " + raiseSalary() + " TL" + "\n"+
                "Vergi ve Bonuslar ile birlikte maas: "+ (this.salary - tax() + bonus()) + "\n"+
                "Toplam Maas: " + (this.salary - tax() + bonus() + raiseSalary());
    }
}
