package com.cdac.cdacpractice.serviceImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.cdacpractice.entity.Candidate;
import com.cdac.cdacpractice.exception.ResourceNotFoundException;
import com.cdac.cdacpractice.repository.CandidateRepository;
import com.cdac.cdacpractice.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	CandidateRepository candidateRepository;

	@Override
	public String saveCandidate(Candidate candidate) {
		String save = candidateRepository.save(candidate);
		return save;
	}

	@Override
	public Collection<Candidate> findAllCandidate() {
		return candidateRepository.findAll();
	}

	@Override
	public Candidate findById(int id) {
		return candidateRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " Not Found"));
	}

	@Override
	public String removeById(int id) {
		return candidateRepository.deleteById(id).orElseThrow(() -> new ResourceNotFoundException(id + " Not Found"));
	}
}
