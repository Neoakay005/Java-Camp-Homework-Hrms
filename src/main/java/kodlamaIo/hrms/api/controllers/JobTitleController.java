package kodlamaIo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.hrms.business.abstracts.JobTitleService;
import kodlamaIo.hrms.core.utilities.results.DataResult;
import kodlamaIo.hrms.core.utilities.results.Result;
import kodlamaIo.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/jobtitles")
public class JobTitleController {
	
	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll(){
		return this.jobTitleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle){
		return this.jobTitleService.add(jobTitle);
	}
}
