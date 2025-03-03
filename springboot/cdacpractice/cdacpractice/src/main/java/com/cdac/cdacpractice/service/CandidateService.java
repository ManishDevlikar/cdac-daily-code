package com.cdac.cdacpractice.service;

import java.util.Collection;

import com.cdac.cdacpractice.entity.Candidate;

public interface CandidateService {

	public String saveCandidate(Candidate candidate);

	public Collection<Candidate> findAllCandidate();

	public Candidate findById(int id);

	public String removeById(int id);
}
