package com.example.MySpringFrameWork.studentcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.MySpringFrameWork.domain.Student;
import com.example.MySpringFrameWork.repo.StudentRepository;
@Controller
public class StudentController {
     
  @Autowired
  private StudentRepository stdrepo;
  
     @GetMapping("/index")
  public String GetForm(Model model) {
     model.addAttribute("student",new Student());
     return "index";
  }
     
     @PostMapping("/registration")
      public String PostForm(@ModelAttribute Student student,Model model) {
       System.out.println(student.toString());
       System.out.println(student.getStdname());
       System.out.println(student.getCname());
       System.out.println(student.getId());
       Student std_inserted = stdrepo.save(student);
       model.addAttribute("Message",std_inserted.getStdname()+ " " + "inserted.");
       return "registration";
     }
}