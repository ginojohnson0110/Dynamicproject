package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
	@Autowired
	Repodetails repo;
	
	@RequestMapping("/home")
	public String homepage()
	{
		return "home.jsp";
	}
	
	@PostMapping("/postdata")
	@ResponseBody
	public String postdata( Mydata data)
	{
		repo.save(data);
		return "data added successfully";
	}
	
	@GetMapping("/showdata")
	@ResponseBody
	public List<Mydata> showdata()
	{
		return repo.findAll();
	}
	@RequestMapping("/deletedata")
	@ResponseBody
	public String deletedata(@RequestParam("id") int id)
	{
		repo.deleteById(id);
		return "deleted successfully";
	}
	
	@RequestMapping("/updatedata")
	@ResponseBody
	public String updatedata(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("address") String address)
	{
		Mydata obj = repo.findById(id);
		obj.setId(id);
		obj.setName(name);
		obj.setAddress(address);
		repo.save(obj);
		return"updated successfully";
	}

}
