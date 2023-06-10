public class Student {

    private String studentName;
    private String studentAddress;
    private int currentLevel;

    //constructor
    public Student(String studentName, String studentAddress, int currentLevel){
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.currentLevel = currentLevel;
    }

    public void displayName(String name){
        this.studentName = name;
    }

    public void displayAddress(String adderss){
        this.studentAddress = adderss;
    }

    public void currentLevel(int level){
        this.currentLevel = level;
    }

    public void displayStudentDetails(){
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student Address: " + this.studentAddress);
        System.out.println("Student Current Level: " + this.currentLevel);
    }
}
