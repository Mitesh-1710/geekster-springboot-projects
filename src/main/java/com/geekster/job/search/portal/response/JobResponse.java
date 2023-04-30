package com.geekster.job.search.portal.response;

import java.util.List;

import com.geekster.job.search.portal.model.Job;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobResponse {

	private String response;
	private List<Job> jobs;
	
}
