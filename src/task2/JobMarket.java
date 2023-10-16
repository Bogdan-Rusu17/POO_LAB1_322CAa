package task2;

public class JobMarket {
    public static void main(String[] args) {
        Student gigel = new Student();
        gigel.setName("Gigel");
        gigel.setGrade(8.5);

        Student dorel = new Student();
        dorel.setName("Dorel");
        dorel.setGrade(9.0);

        Student marcel = new Student();
        marcel.setName("Marcel");
        marcel.setGrade(9.5);

        Student ionel = new Student();
        ionel.setGrade(10);
        ionel.setName("Ionel");

        Internship google = new Internship();
        google.setMinGrade(9.5);
        google.setName("Google");
        google.setStudents(new Student[3]);
        google.getStudents()[0] = gigel;
        google.getStudents()[1] = marcel;
        google.getStudents()[2] = ionel;

        Student rand_stud;
        rand_stud = google.chooseCandidateRandomly();
        System.out.println(rand_stud.getName());
        google.chooseCandidatesForInterview();

        Internship amazon = new Internship();

        Internship facebook = new Internship();

        Internship microsoft = new Internship();

        Student ionel2 = new Student();
        ionel2.setName("Ionel");
        ionel2.setGrade(10);

        if (ionel.equals(ionel2))
            System.out.println("Da, sunt egale");
        else
            System.out.println("Nu, nu sunt egale");
    }
}
