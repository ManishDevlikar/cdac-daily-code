package com.cdac.cdacpractice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.cdacpractice.entity.Candidate;
import com.cdac.cdacpractice.repository.CandidateRepository;
import com.cdac.cdacpractice.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService{

	@Autowired
	CandidateRepository candidateRepository;	
	
	@Override
	public String saveCandidate(Candidate candidate) {
		String save = candidateRepository.save(candidate);
		return save;
	}
}
