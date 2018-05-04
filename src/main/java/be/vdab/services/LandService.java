package be.vdab.services;

import java.util.List;

import be.vdab.entities.Land;
import be.vdab.repositories.LandRepository;

public class LandService extends AbstractService {
	
	private final LandRepository lr = new LandRepository();
	
	public List<Land> findAll() { 
		return lr.findAll();
	}

}
