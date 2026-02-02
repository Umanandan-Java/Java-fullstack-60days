public class Class{
    public static void main(String[] args) {
        sample1 s = new sample1();
        System.out.println(s.name);
        System.out.println(s.college);
        System.out.println(s.reg_no);
        sample1 s1 = new sample1("Kiran");
    }
}
class sample1{
    String name,college,reg_no;
    // Constructor, Constructure overloading
    // Constructor with parameters
    sample1(String name){
        // this keyword refers to the reference obj something like s.name and college.name
        this.name=name;
        college="ANU";
        reg_no="y25mc20035";
    }
    // Constructor without parameters
    sample1(){
    name="Umanandan";
    college="ANU";
    reg_no = "y25mc20075";
    }
}