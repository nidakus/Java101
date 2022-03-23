public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "0535");
        Teacher t2 = new Teacher("Graham Bell","FZK","0531");
        Teacher t3 = new Teacher("Kulyutmaz","BIO","0533");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Inek Saban", "123", "4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,100,100,100,100,100);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi","456","2",tarih,fizik,biyo);
        s2.addBulkExamNote(50,70,90,70,70,50);
        s2.isPass();
    }
}
