package greatlearningassignement;

class TechDepartment extends SuperDepartment{
	
	//Member Function to return Department Name
	String departmentName() {
		//Variable storing Department Name
		String msg = "Tech Department";
		return msg;
	}
	
	//Member Function to return Work
	String getTodaysWork() {
		//_______ Variable storing Work _______//
		String msg = "Complete coding of module 1";
		return msg;
	}
	
	//Member Function to return Work Deadline
	String getWorkDeadline() {
		//Variable storing Work Deadline
		String msg = "Complete by EOD";
		return msg;
	}
	
	//Member Function to return Stack Information
	String getTechStackInformation() {
		//Variable storing Stack Information
		String msg = "core Java";
		return msg;
	}
}
