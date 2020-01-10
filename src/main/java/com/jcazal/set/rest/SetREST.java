package com.jcazal.set.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jcazal.set.daos.SetDAO;
import com.jcazal.set.entitys.Set;

@RestController
@RequestMapping("contribuyentes")
public class SetREST {

	@Autowired
	private SetDAO setDAO;

	@GetMapping
	public ResponseEntity<List<Set>> getContribuyentes() {
		List<Set> setList = setDAO.findAll();
		return ResponseEntity.ok(setList);
	}

	@RequestMapping(value = "{setId}", method = RequestMethod.GET)
	public ResponseEntity<Set> getContribuyentesById(@PathVariable("setId") Long setId) {
		Optional<Set> optionalSet = setDAO.findById(setId);
		if (!optionalSet.isPresent()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(optionalSet.get());

		}
	}

	@RequestMapping(value = "razon/{setRazon_social}", method = RequestMethod.GET)
	public ResponseEntity<List<Set>> getContribuyentesByRazonSocial(
			@PathVariable("setRazon_social") String razon_social) {
		List<Set> setList = setDAO.findrazon_social(razon_social);
		return ResponseEntity.ok(setList);
	}

	@PostMapping
	public ResponseEntity<Set> createSet(@RequestBody Set set) {
		Set newSet = setDAO.save(set);
		return ResponseEntity.ok(newSet);
	}

	@DeleteMapping(value = "{setId}")
	public ResponseEntity<Void> deleteSet(@PathVariable("setId") Long setId) {
		setDAO.deleteById(setId);
		return ResponseEntity.ok(null);
	}

	@PutMapping
	public ResponseEntity<Set> updateSet(@RequestBody Set set) {
		Optional<Set> optionalSet = setDAO.findById(set.getId());
		if (optionalSet.isPresent()) {
			Set setupdate = optionalSet.get();
			setupdate.setDv(set.getDv());
			setupdate.setRazon_social(set.getRazon_social());
			setupdate.setRuc(set.getRuc());
			setupdate.setTipo(set.getTipo());
			setDAO.save(setupdate);
			return ResponseEntity.ok(setupdate);
		} else {
			return ResponseEntity.notFound().build();

		}
	}

	/*
	 * //@GetMapping
	 * 
	 * @RequestMapping(value="hello",method=RequestMethod.GET) public String hello()
	 * { return "Hello World"; }
	 */

}
