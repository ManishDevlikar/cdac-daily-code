package com.cdac.cdacpractice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.cdacpractice.entity.Candidate;
import com.cdac.cdacpractice.service.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

	@Autowired
	CandidateService candidateService;

	@PostMapping("/save")
	public ResponseEntity<String> saveCandidate(@RequestBody Candidate candidate) {
		return new ResponseEntity<>(candidateService.saveCandidate(candidate), HttpStatus.CREATED);
	}

	@GetMapping("/find")
	public ResponseEntity<Collection<Candidate>> findAllCandidate() {
		return new ResponseEntity<>(candidateService.findAllCandidate(), HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Candidate> findById(@PathVariable int id) {
		return new ResponseEntity<Candidate>(candidateService.findById(id), HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> removeById(@RequestParam int id) {
		return new ResponseEntity<String>(candidateService.removeById(id), HttpStatus.OK);
	}
}
