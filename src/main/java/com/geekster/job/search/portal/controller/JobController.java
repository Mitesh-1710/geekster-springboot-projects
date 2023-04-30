package com.geekster.job.search.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.job.search.portal.constants.ApiPath;
import com.geekster.job.search.portal.model.Job;
import com.geekster.job.search.portal.response.JobResponse;
import com.geekster.job.search.portal.service.JobService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ApiPath.BASE_API)
public class JobController {

	@Autowired
	private JobService studentService;

	@PostMapping(ApiPath.JOB_API_CREATE_JOB)
	public String addJob(@Valid @RequestBody Job job) {
		return studentService.addJob(job);
	}

	@PutMapping(ApiPath.JOB_API_JOB_ID_PATH_VARIABLE)
	public String updateJobById(@PathVariable String jobId, @Valid @RequestBody Job job) {
		return studentService.updateJobById(jobId, job);
	}

	@DeleteMapping(ApiPath.JOB_API_JOB_ID_PATH_VARIABLE)
	public String deleteJobById(@PathVariable String jobId) {
		return studentService.deleteJobById(jobId);
	}

	@GetMapping(ApiPath.JOB_API_GET_ALL_JOBS)
	public JobResponse getAllJobs() {
		return studentService.getAllJobs();
	}

	@GetMapping(ApiPath.JOB_API_JOB_ID_PATH_VARIABLE)
	public JobResponse getJobById(@PathVariable String jobId) {
		return studentService.getJobById(jobId);
	}

	@GetMapping(ApiPath.JOB_API_TITLE_PATH_VARIABLE)
	public JobResponse getJobsByTitle(@PathVariable String title) {
		return studentService.getJobsByTitle(title);
	}

	@GetMapping(ApiPath.JOB_API_SALARY_PATH_VARIABLE)
	public JobResponse getJobsBySalaryGreaterThan(@PathVariable String salary) {
		return studentService.getJobsBySalaryGreaterThan(salary);
	}

	@GetMapping(ApiPath.JOB_API_APPLIED_DATE_PATH_VARIABLE)
	public JobResponse getJobsByAppliedDate(@PathVariable String appliedDate) {
		return studentService.getJobsByAppliedDate(appliedDate);
	}

	@GetMapping(ApiPath.JOB_API_KEYWORD_PATH_VARIABLE)
	public JobResponse getJobsByKeyword(@PathVariable String keyword) {
		return studentService.getJobsByKeyword(keyword);
	}

}
