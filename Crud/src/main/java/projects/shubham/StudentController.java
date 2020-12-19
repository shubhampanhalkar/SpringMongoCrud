package projects.shubham;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository StudentRepository;
	
	@PostMapping("/AddStudent")
	public Students createStudent(@RequestBody Students student)
	{
		return StudentRepository.save(student);
	}
	
	@GetMapping("/Student/{id}")
	public Students getStudentData(@PathVariable int id)
	{
		return StudentRepository.findById(id).orElse(null);
	}
	
	@GetMapping("/AllStudent")
	public List<Students> readAllStudentData()
	{
		return StudentRepository.findAll();
	}
	
	@PutMapping("/Update")
	public String updateStudentData(@RequestBody Students student2)
	{
		 Students s1 = StudentRepository.findById(student2.getId()).orElse(null);
		 s1.setCity(student2.city);
		 StudentRepository.save(s1);
		 return "Data updated";
	}
	
	@PutMapping("/Delete/{id}")
	public String deleteStudentData(@PathVariable int id)
	{
		 Students s1 = StudentRepository.findById(id).orElse(null);
		 StudentRepository.delete(s1);
		 return "Data deleted";
	}
}
