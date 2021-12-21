package OBS;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course matsozlu;
    Course fiziksozlu;
    Course kimyasozlu;
    double avarage;
    boolean isPass;
    double finalNote1;
    double finalNote2;
    double finalNote3;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya,Course matsozlu,Course fiziksozlu,Course kimyasozlu) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matsozlu = matsozlu;
        this.fiziksozlu = fiziksozlu;
        this.kimyasozlu = kimyasozlu;

        calcAvarage();
        this.isPass = false;
        this.finalNote1 = 0;
        this.finalNote2 = 0;
        this.finalNote3 = 0;

    }



    void addBulkExamNote(int note1, int note2, int note3,int matsozlu,int fiziksozlu,int kimyasozlu){
        if((note1 >= 0 && note1 <= 100) && (matsozlu >= 0 && matsozlu <= 100)){
            this.mat.note = note1;
            this.matsozlu.sozlu = matsozlu;
        }

        if((note2 >= 0 && note2 <= 100) && (fiziksozlu >= 0 && fiziksozlu <= 100)){
            this.fizik.note = note2;
            this.fiziksozlu.sozlu = fiziksozlu;
        }

        if((note3 >= 0 && note3 <= 100) && (kimyasozlu >= 0 && kimyasozlu <= 100)){
            this.kimya.note = note3;
            this.kimyasozlu.note = kimyasozlu;
        }
    }
    void calculateNote(){
        this.finalNote1 = (this.mat.note * 0.8)+( this.matsozlu.note * 0.2);
        this.finalNote2 = (this.fizik.note * 0.8)+(this.fiziksozlu.note * 0.2);
        this.finalNote3 = (this.kimya.note * 0.8)+(this.kimyasozlu.note * 0.2);
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
