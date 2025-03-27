package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Placement;
import com.example.demo.repository.Placementrepository;

@Service
public class PlacementService {
	
	@Autowired
	public Placementrepository erepo;
	
	public Placement addPlacement(Placement pl)
	{
		return erepo.save(pl);
	}
	
	public List<Placement> getPlacement()
	{
		return erepo.findAll();
	}
	
	public void deletePlacement(long id)
	{
		erepo.deleteById(id);
	}
	public Placement updatePlacement(Placement pl)
	{
		Long id=pl.getId();
		Placement pl1=erepo.findById(id).get();
		pl1.setName(pl.getName());
		return erepo.save(pl);
	}
}