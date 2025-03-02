package com.cdac.cdacpractice.util;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.cdac.cdacpractice.entity.Candidate;
import com.cdac.cdacpractice.repository.CandidateRepository;

@Repository
public class Database implements CandidateRepository {
	private Collection<Candidate> candidateDb = new ArrayList<>();

	@Override
	public String save(Candidate candidate) {
		boolean b = candidateDb.add(candidate);
		return b ? candidate.getCandidateId() + " candidate saved" : "not saved";
	}
}
