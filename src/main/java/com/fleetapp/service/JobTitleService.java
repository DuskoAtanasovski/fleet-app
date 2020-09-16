package com.fleetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleetapp.model.JobTitle;
import com.fleetapp.repository.JobTitleRepository;

@Service
public class JobTitleService {

	@Autowired
	private JobTitleRepository jobTitleRepository;

	// List of jobTitles
	public List<JobTitle> getJobTitles() {
		return jobTitleRepository.findAll();
	}

	// Save new jobTitle
	public void save(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}

	// Get jobTitle by id
	public Optional<JobTitle> findById(int id) {
		return jobTitleRepository.findById(id);
	}

	// Delete jobTitle
	public void delete(Integer id) {
		jobTitleRepository.deleteById(id);

	}
}
