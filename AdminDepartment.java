package greatlearningassignement;

class AdminDepartment extends SuperDepartment {
	
	//Member Function to return Department Name
	String departmentName() {
		//Variable storing Department Name
		String msg = "Admin Department ";
		return msg;
	}
	
	// Member Function to return Work
	String getTodaysWork() {
		//Variable storing Work
		String msg = "Complete your documents Submission";
		return msg;
	}
	
	//Member Function to return Work Deadline
	String getWorkDeadline() {
		//Variable storing Work Deadline
		String msg = "Complete by EOD";
		return msg;
	}
	
}
