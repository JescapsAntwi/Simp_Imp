////Write a java program that stores the details of at least 10 students like their name, ID, and overall course grade(e.g. A+)
////and finds the student details with the given last name and ID using binary search.
//
//
//import java.util.Locale;
//
//class Student implements Comparable<Student> {
//    //student parameters
//    private String firstname;
//    private String lastname;
//    private int id;
//    private String courseGrade;
//
//    //Student constructor
//    public Student (String firstname, String lastname, int id, String courseGrade ) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.id = id;
//        this.courseGrade = courseGrade;
//    }
//
//    //Getters
//    public int getId() {
//        return this.id;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public String getLastname(){
//        return lastname;
//    }
//    public String getCourseGrade(){
//        return courseGrade;
//    }
//
//    @Override
//    public String toString(){
//        return firstname + " " + lastname + " | " + id + " " + courseGrade;
//    }
//
//    //compareTo method
//    @Override
//    public int compareTo(Student other) {
//        String std_1 = this.lastname.toLowerCase() + this.id;
//        String std_2 = other.lastname.toLowerCase() + other.id;
//        return std_1.compareTo(std_2);
//    }
//}
