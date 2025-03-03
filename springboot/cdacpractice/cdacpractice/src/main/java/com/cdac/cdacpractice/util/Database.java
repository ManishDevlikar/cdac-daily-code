package com.cdac.cdacpractice.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

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

	@Override
	public Collection<Candidate> findAll() {
		return candidateDb;
	}

	@Override
	public Optional<Candidate> findById(int id) {
		return candidateDb.stream().filter(can -> can.getCandidateId().equals(id)).findFirst();
	}

	@Override
	public Optional<String> deleteById(int id) {
		Optional<Candidate> candidate = candidateDb.stream().filter(cand -> cand.getCandidateId().equals(id))
				.findFirst();
		if (candidate.isPresent()) {
			Candidate candidateObj = candidate.get();
			candidateDb.remove(candidateObj);
			return Optional.of(candidateObj.getCandidateId() + " candidate removed");
		}
		return Optional.empty();
	}
}
