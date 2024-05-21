package New_21st_may;

public class Person {
    private String name;
    private String schoolName;
    private String password;
    private String matricNo;
    private int staffNo;

//    public Person(String schoolname, String name, String password, String matricNo) {
//        this.schoolName = schoolname;
//        this.name = name;
//        this.password = password;
//        this.matricNo = matricNo;
//    }

    public Person( int staffNo, String password, String name, String schoolName) {
        this.staffNo = staffNo;
        this.password = password;
        this.name = name;
        this.schoolName = schoolName;
    }


}
