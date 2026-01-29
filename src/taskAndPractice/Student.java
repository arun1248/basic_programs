package taskAndPractice;

public class Student {
    String studentName;
    int rollno;
    int marks;

    Student(String studentNameVal, int rollnoVal, int theoryMarksVal)
    {
        studentName = studentNameVal;
        rollno = rollnoVal;
        marks = theoryMarksVal;
    }

    void practicalMarksInc(int practicalMarks)
    {
        marks = marks+practicalMarks;
    }

    void studentDetails(){
        System.out.println(studentName);
        System.out.println(rollno);
        System.out.println(marks);
    }
    public static void main(String[] args)
    {
        Student student1 = new Student("Inzamam", 25, 80);
        System.out.println("Student 1 details");
        student1.studentDetails();
        student1.practicalMarksInc(20);
        student1.studentDetails();

        Student student2 = new Student("Nazrin", 45, 70);
        System.out.println("Student 2 details");
        student2.studentDetails();
        student2.practicalMarksInc(20);
        student2.studentDetails();
    }
}
