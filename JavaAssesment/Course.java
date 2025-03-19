package JavaAssesment;
abstract class Course{
int courseId;
String courseName;
String instructor;
int durationWeeks;
double fee;

public  Course(int courseId, String courseName, String instructor, int durationWeeks, double fee) {
	
	if (durationWeeks <= 0 || fee <= 0) {
        throw new IllegalArgumentException("Duration and fee must be greater than 0");
    }
    this.courseId = courseId;
    this.courseName = courseName;
    this.instructor = instructor;
    this.durationWeeks = durationWeeks;
    this.fee = fee;
}

abstract double calculateDiscount();


}
