
package quiz01;


public class Class {
    private Teacher teacher;
    private String course;

    public Class(Teacher teacher, String course) {
        this.teacher = teacher;
        this.course = course;
    }

    public void printInformation() {
        System.out.println(course + ", teacher: " + teacher);
    }

}
