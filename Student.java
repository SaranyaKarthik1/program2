public class Student{
    String name;
    int id;
    static String school="Zoho school";
    public static void getschool()
    {
        System.out.println(Student.school);
        
    }
    public static void main(String[] args){
        Student.getschool();
    }
}