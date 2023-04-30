package com.geekster.job.search.portal.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.geekster.job.search.portal.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

	public List<Job> findAllByTitle(String title);

	@Query(value = "SELECT * FROM Job j WHERE j.salary >= :salary", nativeQuery = true)
	public List<Job> findAllBySalaryGreaterThan(Integer salary);

	public List<Job> findAllByAppliedDate(LocalDate date);

	@Query(value = "DELETE FROM Job WHERE id = :jobId", nativeQuery = true)
	public void deleteById(Long jobId);

	@Query(value = "UPDATE Job SET title = :title , description = :description , location = :location , salary = :salary , companyName = :companyName WHERE id = :jobId", nativeQuery = true)
	public void updateById(String title, String description, String location, Double salary, String companyName);

}
