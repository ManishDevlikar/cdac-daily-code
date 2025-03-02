package com.cdac.cdacpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.cdacpractice.entity.Candidate;
import com.cdac.cdacpractice.service.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
	
	@Autowired
	CandidateService candidateService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCandidate(@RequestBody Candidate candidate){
		return new ResponseEntity<>(candidateService.saveCandidate(candidate),HttpStatus.CREATED);
	}
}
