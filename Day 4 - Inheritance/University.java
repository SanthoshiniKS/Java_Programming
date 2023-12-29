import java.util.*;
public class University {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        System.out.println("Select Category:\n1.Student\n2.Professor\n3.Course\n4.Exit\nEnter your choice:");
        int c = obj.nextInt();
        while (c != 4) {
            if (c == 1) {
                studentinput(obj,students,courses);
            }
            if(c==2){
                professorinput(obj);
            }
            if(c==3){
                courseinput(obj,courses);
            }
            System.out.println("Do you want to proceed: (yes/no)");
            String y = obj.next();
            if (y.equalsIgnoreCase("yes")) {
                System.out.println("Select Category:\n1.Student\n2.Professor\n3.Course\n4.Exit\nEnter your choice:");
                c = obj.nextInt();
            }
            else
              break;
        }

    }
    public static void studentinput(Scanner obj,List<Student> students,List<Course> courses){
                System.out.println("Enter Student name:");
                String name = obj.next();
                System.out.println("Enter Student age:");
                int age = obj.nextInt();
                Student s = new Student(name, age);
                students.add(s);
                System.out.println("Enter no. of Courses Completed:");
                int n = obj.nextInt();
                System.out.println("Enter the courses completed");
                for (int i = 0; i < n; i++) {
                    String a = obj.next();
                    s.completed(a);
                }
                System.out.println("Do you want to enroll in courses?(yes/no)");
                String y = obj.next();
                if (y.equalsIgnoreCase("yes")) {
                    System.out.println("Courses available:");
                    for(Course c:courses){
                        System.out.println(c.getName());
                    }
                    System.out.println("Select a course from the list:");
                    String cname=obj.next();
                    int f=0;
                    Course select=findCourse(cname,courses);
                    if(select!=null){
                        select.enroll(s);
                    }
                    else
                        System.out.println("Course not found");
                }
            }
    public static void professorinput(Scanner obj){
        System.out.println("Enter Professor name:");
        String name=obj.next();
        System.out.println("Enter Professor age:");
        int age=obj.nextInt();
        System.out.println("Enter Professor department:");
        String dept=obj.next();
        Professor p=new Professor(name,age,dept);
        System.out.println("\nProfessor details");
        System.out.println("Name: "+p.getName()+"\nAge: "+p.getAge()+"\nDepartment: "+p.getDepartment());
    }
    public static void courseinput(Scanner obj,List<Course> courses){
        System.out.println("How many courses do you want to add:");
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter course name:");
            String cname=obj.next();
            Course c=findCourse(cname,courses);
            if(c==null){
                Course co=new Course(cname);
                System.out.println("Enter prerequisites for the course:(enter 'exit' when finished): ");
                String pre;
                do{
                    pre=obj.next();
                    if(!pre.equalsIgnoreCase("done"))
                        co.addPrerequisite(pre);
                }while(!pre.equalsIgnoreCase("done"));
                courses.add(co);
            }
            else
               System.out.println("Course already exists");
            System.out.println("Course added: "+cname);
        }
    }
    public static Course findCourse(String name,List<Course> courses){
        for(Course c:courses){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }
}

class Person {
    String name;
    int age;
    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

class Student extends Person {
    List<String> completedCourses;
    Student(String n, int a) {
        super(n, a);
        this.completedCourses = new ArrayList<>();
    }
    public void completed(String cname) {
        completedCourses.add(cname);
    }
    public List<String> getCompleted() {
        return completedCourses;
    }
}

class Professor extends Person {
    String dept;
    Professor(String n, int a, String dept) {
        super(n, a);
        this.dept = dept;
    }
    public String getDepartment() {
        return dept;
    }
}

class Course {
    String name;
    List<String> prerequisites;
    List<Student> enrolled;
    public Course(String name) {
        this.name = name;
        this.prerequisites = new ArrayList<>();
        this.enrolled = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addPrerequisite(String pre) {
        prerequisites.add(pre);
    }
    public void enroll(Student student) {
        if (meet(student)) {
            enrolled.add(student);
            System.out.println(student.getName() + " is enrolled in the course " + name);
        } else {
            System.out.println(student.getName() + " does not meet prerequisites for the course " + name);
        }
    }
    public boolean meet(Student student) {
        if(student.getCompleted().containsAll(prerequisites)) {
            return true;
        }
        return false;
    }
    public void display() {
        System.out.println("Enrolled Students in " + name + ":");
        for (Student s : enrolled) {
            System.out.println("Name: " + s.getName() + "\nAge: " + s.getAge());
        }
    }
}



/*
Select Category:
1.Student
2.Professor
3.Course
4.Exit
Enter your choice:3
How many courses do you want to add:
1
Enter course name:
java
Enter Prerequisites for the course (enter 'done' when finished):
algorithm
done
Course added: java
Do you want to proceed? (yes/no)
yes
Select Category:
1.Student
2.Professor
3.Course
4.Exit
Enter your choice:
1
Enter Student name:
aaa
Enter Student age:
12
Enter no. of Courses Completed:
1
Enter the courses completed:
algorithm
Do you want to enroll in courses? (yes/no)
yes
Courses available:
java
Select a course from the list:
java
aaa is enrolled in the course java
Do you want to proceed? (yes/no)yes
Select Category:
1.Student
2.Professor
3.Course
4.Exit
Enter your choice:
2
Enter Professor name:
dr.bbbbb
Enter Professor age:
45
Enter Professor department:
cse
Professor details
Name: dr.bbbbb
Age: 45
Department: cse
Do you want to proceed? (yes/no)
no
*/