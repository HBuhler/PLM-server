package controllers;

import models.Teacher;
import play.mvc.Controller;
import play.mvc.Result;

public class TeacherController extends Controller {
	
	public static Result createTeacher(String name) {
		Teacher teacher = new Teacher(name);
		
		Teacher.create(teacher);
		
		return ok(
		views.html.createTeacherOk.render()
	  );
	}
	
	public static Result deleteTeacher(String name) {
	  Teacher.delete(name, "");
	  return redirect(routes.Application.teachers());
	}

}