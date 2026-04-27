package tasks.MapTask;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    static LinkedHashMap<Student,Integer> students = new LinkedHashMap<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student st1 = new Student("Nazrin");
        Subject sub1 = new Subject(70, 80, 90, 90);
        students.put(st1, sub1.calcTot());
        Student st2 = new Student("Inza");
        Subject sub2 = new Subject(40, 30, 50, 50);
        students.put(st2, sub2.calcTot());
        Student st3 = new Student("Faheeem");
        Subject sub3 = new Subject(100, 100, 100, 100);
        students.put(st3, sub3.calcTot());

        System.out.println("1. Enter Student details, 2. View student details 3.Mark of a specific student" +
                "4. Update mark 5.Remova 6.Highest Mark 7.Marks greater than 200");
        int input = Integer.parseInt(sc.nextLine());
        while(true){
            switch (input){
                case 1:
                    getStudentDetails();
                    break;
                case 2:
                    viewStudentTotMarks();
                    break;
                case 3:
                    markOfStudent();
                    break;
                case 4:
                    updateMark();
                    break;
                case 5:
                    remove();
                    break;
                case 6:
                    getMaxMark();
                    break;
                case 7:
                    greaterThan200();
                    break;
                default:
                    System.out.println("Enter valid input");
            }
            System.out.println("1. Enter Student details, 2. View student details 3.Mark of a specific student" +
                    "4. Update mark 5.Remova 6.Highest Mark 7.Marks greater than 200 8. Exit....");
            input = Integer.parseInt(sc.nextLine());
            if(input == 8)
            {
                System.out.println("Exit...");
                break;
            }
        }

    }
    public static void getStudentDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to enter student details? Yes or No");
        String input;
        input = sc.nextLine();
        while(input.equalsIgnoreCase("Yes"))
        {
            System.out.println("Enter Student name:");
            String name = sc.nextLine();
            Student st = new Student(name);
            System.out.println("Enter subject marks");
            System.out.println("Enter science marks");
            int sciMark = Integer.parseInt(sc.nextLine());
            System.out.println("Enter tamil marks");
            int tamMark = Integer.parseInt(sc.nextLine());
            System.out.println("Enter english marks");
            int engMark = Integer.parseInt(sc.nextLine());
            System.out.println("Enter maths marks");
            int matMark = Integer.parseInt(sc.nextLine());
            Subject sub = new Subject(sciMark, tamMark, engMark, matMark);
            students.put(st, sub.calcTot());

            System.out.println("Do you want to continue? Yes or No");
            input = sc.nextLine();
        }
    }
    public static void viewStudentTotMarks()
    {
        System.out.println("Student Total Marks:");
        for(Map.Entry<Student,Integer> entry : students.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void markOfStudent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name");
        String name = sc.nextLine();
        boolean flag = false;

        for(Map.Entry<Student,Integer> entry : students.entrySet()){
            if(entry.getKey().name.equalsIgnoreCase(name)){
                System.out.println(entry);
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println(name+" is not present");
    }

    public static void updateMark(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name to update the mark:");
        String name = sc.nextLine();
        Student st = new Student(name);
        System.out.println("Enter the mark to be update");
        int mark = Integer.parseInt(sc.nextLine());

        for(Map.Entry<Student , Integer> entry : students.entrySet()){
            if(entry.getKey().equals(st)){
                students.put(entry.getKey() , mark);
                break;
            }
        }
        System.out.println("Updated result: "+students);
    }

    public static void remove(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name to be removed");
        String name = sc.nextLine();
        Student st = new Student(name);

//        for(Map.Entry<Student , Integer> entry : students.entrySet()){
//            if(entry.getKey().equals(st)){
//                students.remove(entry.getKey());
//            }
//        }
        ArrayList<Map.Entry<Student , Integer>> entry = new ArrayList<>(students.entrySet().stream().toList());
        //System.out.println("List: "+entry);
        for(int i = 0; i < entry.size(); i++){
            Map.Entry<Student , Integer> item = entry.get(i);
            //System.out.println("Item: "+item);
            if (item.getKey().equals(st)) {
                  entry.remove(i);
            }
        }
        System.out.println("List after removal: "+entry);

//        Iterator<Map.Entry<Student, Integer>> it = students.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<Student, Integer> entry = it.next();
//            if (entry.getKey().equals(st)) {
//                it.remove(); // safe removal during iteration
//            }
//        }
//        System.out.println("Result after removal: "+students);
    }

    public static void getMaxMark()
    {
        var max = students.entrySet()
                .stream()
                .max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .get();

        System.out.println("Highest Mark: "+max);
//      putLast is available from latest java 25 version only
//        students.entrySet().stream()
//                //if value is not an Integer and if value is subject
//                // we can sort by using a comparator and it's also possible by sort only one subject mark
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(e -> students.putLast(e.getKey(), e.getValue()));
//        System.out.println(students);
    }
    public static void greaterThan200(){
//        System.out.println("Students scored more than 200"+
//        students.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > 200)
//                .toList());
        System.out.println("Students scored more than 200");
        for(Map.Entry<Student , Integer> entry : students.entrySet()) {
            if(entry.getValue() > 200)
                System.out.println(entry);
        }
    }


}
