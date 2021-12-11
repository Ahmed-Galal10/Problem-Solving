import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}


public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
        studentList.sort(new Comparator<Student>(){
            public int compare(Student std1, Student std2){
                if(std1.getCgpa() == std2.getCgpa()){
                    return std1.getFname().compareTo(std2.getFname());
                }
                else{
                    return std1.getCgpa() < std2.getCgpa()? 1 : -1;
                }
            }
        });
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
