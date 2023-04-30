package com.geekster.job.search.portal.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.geekster.job.search.portal.constants.JobSearchPortalConstants;
import com.geekster.job.search.portal.model.Job;
import com.geekster.job.search.portal.repository.JobRepository;
import com.geekster.job.search.portal.response.JobResponse;
import com.geekster.job.search.portal.service.JobService;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobRepository jobRepository;

	@Override
	public String addJob(Job job) {
		jobRepository.save(job);
		return JobSearchPortalConstants.JOB_CREATE_RESPONSE;
	}

	@Override
	public String updateJobById(String jobId, Job job) {
		Optional<Job> optionalStudent = jobRepository.findById(Integer.parseInt(jobId));
		String response = null;
		if (optionalStudent.isPresent()) {
			Job oldJob = optionalStudent.get();
			oldJob = oldJob.toBuilder().title(job.getTitle()).description(job.getDescription())
					.location(job.getLocation()).salary(job.getSalary()).companyName(job.getCompanyName())
					.employerName(job.getEmployerName()).jobType(job.getJobType()).appliedDate(job.getAppliedDate())
					.build();
			jobRepository.save(oldJob);
			response = JobSearchPortalConstants.JOB_UPDATE_RESPONSE;
		} else {
			response = JobSearchPortalConstants.INVALID_JOB_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public String deleteJobById(String jobId) {
		Optional<Job> optionalStudent = jobRepository.findById(Integer.parseInt(jobId));
		String response = null;
		if (optionalStudent.isPresent()) {
			jobRepository.deleteById(Integer.parseInt(jobId));
			response = JobSearchPortalConstants.JOB_DELETE_RESPONSE;
		} else {
			response = JobSearchPortalConstants.INVALID_JOB_ID_RESPONSE;
		}
		return response;
	}

	@Override
	public JobResponse getAllJobs() {
		List<Job> jobs = jobRepository.findAll();
		JobResponse jobResponse = new JobResponse();
		jobResponse.setJobs(jobs);
		if (!CollectionUtils.isEmpty(jobs)) {
			jobResponse.setResponse(JobSearchPortalConstants.JOB_GET_ALL_RESPONSE);
		} else {
			jobResponse.setResponse(JobSearchPortalConstants.NO_DATA_FOUND_RESPONSE);
		}
		return jobResponse;
	}

	@Override
	public JobResponse getJobById(String jobId) {
		Optional<Job> optionalStudent = jobRepository.findById(Integer.parseInt(jobId));
		JobResponse studentResponse = new JobResponse();
		if (optionalStudent.isPresent()) {
			List<Job> jobs = new ArrayList<>();
			jobs.add(optionalStudent.get());
			studentResponse.setJobs(jobs);
			studentResponse.setResponse(JobSearchPortalConstants.JOB_GET_RESPONSE);
		} else {
			studentResponse.setJobs(null);
			studentResponse.setResponse(JobSearchPortalConstants.INVALID_JOB_ID_RESPONSE);
		}
		return studentResponse;
	}

	@Override
	public JobResponse getJobsByTitle(String title) {
		List<Job> jobs = jobRepository.findAllByTitle(title);
		JobResponse jobResponse = new JobResponse();
		jobResponse.setJobs(jobs);
		if (!CollectionUtils.isEmpty(jobs)) {
			jobResponse.setResponse(JobSearchPortalConstants.JOB_GET_ALL_RESPONSE);
		} else {
			jobResponse.setResponse(JobSearchPortalConstants.NO_DATA_FOUND_RESPONSE);
		}
		return jobResponse;
	}

	@Override
	public JobResponse getJobsBySalaryGreaterThan(String salary) {
		List<Job> jobs = jobRepository.findAllBySalaryGreaterThan(Integer.parseInt(salary));
		JobResponse jobResponse = new JobResponse();
		jobResponse.setJobs(jobs);
		if (!CollectionUtils.isEmpty(jobs)) {
			jobResponse.setResponse(JobSearchPortalConstants.JOB_GET_ALL_RESPONSE);
		} else {
			jobResponse.setResponse(JobSearchPortalConstants.NO_DATA_FOUND_RESPONSE);
		}
		return jobResponse;
	}

	@Override
	public JobResponse getJobsByAppliedDate(String appliedDate) {
		List<Job> jobs = jobRepository.findAllByAppliedDate(LocalDate.parse(appliedDate));
		JobResponse jobResponse = new JobResponse();
		jobResponse.setJobs(jobs);
		if (!CollectionUtils.isEmpty(jobs)) {
			jobResponse.setResponse(JobSearchPortalConstants.JOB_GET_ALL_RESPONSE);
		} else {
			jobResponse.setResponse(JobSearchPortalConstants.NO_DATA_FOUND_RESPONSE);
		}
		return jobResponse;
	}

	@Override
	public JobResponse getJobsByKeyword(String keyword) {
		List<Job> jobs = jobRepository.findAll();

		List<Job> filteredJobsByKeyword = new ArrayList<>();
		jobs.stream().forEach(job -> {
			if (job.getDescription().contains(keyword)) {
				filteredJobsByKeyword.add(job);
			}
		});

		JobResponse jobResponse = new JobResponse();
		jobResponse.setJobs(filteredJobsByKeyword);
		if (!CollectionUtils.isEmpty(filteredJobsByKeyword)) {
			jobResponse.setResponse(JobSearchPortalConstants.JOB_GET_ALL_RESPONSE);
		} else {
			jobResponse.setResponse(JobSearchPortalConstants.NO_DATA_FOUND_RESPONSE);
		}
		return jobResponse;
	}

}
