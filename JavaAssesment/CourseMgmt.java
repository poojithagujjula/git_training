package JavaAssesment;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CourseMgmt {
	
	 private List<Course> courses = new LinkedList<>();

	    public void addCourse(Course course) {
	        courses.add(course);
	    }

	    public List<Course> sortCoursesByFee() {
	        return courses.stream()
	                      .sorted(Comparator.comparingDouble(course -> course.fee))
	                      .collect(Collectors.toList());
	    }

	    public List<Course> filterCoursesByDuration(int minDuration) {
	        return courses.stream()
	                      .filter(course -> course.durationWeeks > minDuration)
	                      .collect(Collectors.toList());
	    }

}
