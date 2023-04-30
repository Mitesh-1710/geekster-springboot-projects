package com.geekster.job.search.portal.service;

import org.springframework.stereotype.Service;

import com.geekster.job.search.portal.model.Job;
import com.geekster.job.search.portal.response.JobResponse;

@Service
public interface JobService {

	public String addJob(Job job);

	public String updateJobById(String jobId, Job job);

	public String deleteJobById(String jobId);

	public JobResponse getAllJobs();

	public JobResponse getJobById(String jobId);

	public JobResponse getJobsByTitle(String title);

	public JobResponse getJobsBySalaryGreaterThan(String salary);

	public JobResponse getJobsByAppliedDate(String appliedDate);

	public JobResponse getJobsByKeyword(String keyword);

}
