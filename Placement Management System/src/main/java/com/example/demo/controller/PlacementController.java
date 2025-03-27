package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Placement;
import com.example.demo.service.PlacementService;

@RestController
public class PlacementController {
	
	@Autowired
	public PlacementService aser;
	
	@PostMapping("/addpl")
	public Placement regPlacement(@RequestBody Placement pl)
	{
	return aser.addPlacement(pl);

    }
	
	@GetMapping("/getpl")
	public List<Placement> getPl()
	{
		return aser.getPlacement();
	}
	
	@DeleteMapping("deletepl/{id}")
	public void deletePl(@PathVariable Long id)
	{
		aser.deletePlacement(id);
	}
	
	@PutMapping("/updatepl")
	public Placement updatePl(@RequestBody Placement pl)
	{
		return aser.updatePlacement(pl);
	}
}