package greatlearningassignement;


public class Main{
	
		// driver Class
			
			public static void main(String[] args) {
				
				//Object for Admin Class 
				AdminDepartment admin = new AdminDepartment();
				//Object for Hr Class
				HrDepartment hr = new HrDepartment();
				//Object for Tech Class
				TechDepartment tech = new TechDepartment();
				
				//Output for Admin Department
				System.out.println("Welcome to "+admin.departmentName());
				System.out.println(admin.getTodaysWork());
				System.out.println(admin.getWorkDeadline());
				System.out.println(admin.isTodayAHoliday());
				
				System.out.println();
				
				//Output for Hr Department
				System.out.println("Welcome to "+hr.departmentName());
				System.out.println(hr.doActivity());
				System.out.println(hr.getTodaysWork());
				System.out.println(hr.getWorkDeadline());
				System.out.println(hr.isTodayAHoliday());
				
				System.out.println();
				
				//Output for Tech Department
				System.out.println("Welcome to "+tech.departmentName());
				System.out.println(tech.getTodaysWork());
				System.out.println(tech.getWorkDeadline());
				System.out.println(tech.getTechStackInformation());
				System.out.println(tech.isTodayAHoliday());
				
			}

		}

