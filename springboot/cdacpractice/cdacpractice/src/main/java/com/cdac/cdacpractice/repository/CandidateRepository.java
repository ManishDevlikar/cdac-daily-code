package com.cdac.cdacpractice.repository;

import java.util.Collection;
import java.util.Optional;

import com.cdac.cdacpractice.entity.Candidate;

public interface CandidateRepository {
	public String save(Candidate candidate);

	public Collection<Candidate> findAll();

	public Optional<Candidate> findById(int id);

	public Optional<String> deleteById(int id);
}
