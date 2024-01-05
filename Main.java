//64050030 นาย กิติภูมิ หน่อเนื้อ
public class Main {
    public static void main(String[] args){
        Student student = new Student.StudentBuilder("Kitipum", "KMITL")
                            //.age(20)
                            .build();

        System.out.println(student);
    }

}
