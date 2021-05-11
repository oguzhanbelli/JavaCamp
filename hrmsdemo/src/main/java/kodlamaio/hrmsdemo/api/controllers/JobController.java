package kodlamaio.hrmsdemo.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kodlamaio.hrmsdemo.business.abstracts.JobService;
import kodlamaio.hrmsdemo.entities.concretes.Job;

@RestController
@RequestMapping("/api")
@Api(value = "Job Api documentation")
public class JobController {
	private JobService jobService;
	

	public JobController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	@GetMapping("/getall")
	 @ApiOperation(value = "Get All Method")
	List<Job> getAll() {
		return jobService.getAll();

	}

	@GetMapping("/getbyid")
	 @ApiOperation(value = "Get Byid Method")
	Optional<Job> getById(Long id) {
		return this.jobService.getById(id);

	}

}
