package greatlearningassignement;

class HrDepartment extends SuperDepartment{
	
	//Member Function to return Department Name
	String departmentName() {
		//Variable storing Department Name
		String msg = "Hr Department";
		return msg;
	}
	
	//Member Function to return Work
	String getTodaysWork() {
		//Variable storing Work
		String msg = "Fill today’s worksheet and mark your attendance";
		return msg;
	}
	
	// Member Function to return Work Deadline
	String getWorkDeadline() {
		//Variable storing Work Deadline
		String msg = "Complete by EOD";
		return msg;
	}
	
	//Member Function to return Activity
	String doActivity() {
		//Variable storing Activity
		String msg = "team Lunch";
		return msg;
	}

}
