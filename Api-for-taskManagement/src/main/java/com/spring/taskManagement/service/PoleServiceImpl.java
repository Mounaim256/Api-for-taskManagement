package com.spring.taskManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.Pole;
import com.spring.taskManagement.model.Task;
import com.spring.taskManagement.repository.PoleRepository;

@Service
public class PoleServiceImpl implements PoleService {

	@Autowired
	private PoleRepository poleRepository;
	
	@Autowired
	private TaskService taskService;
	
	@Override
	public List<Pole> getPoles() {
		return poleRepository.findAll();
	}

	@Override
	public Pole getPole(Long id) {
		Optional<Pole> pole = poleRepository.findById(id);
		return pole.isPresent() ? pole.get() : null;
	}

	@Override
	public Pole addPole(Pole pole) {
		if(pole != null) {
			Task task = taskService.getTaskByName(pole.getName());
			pole.setTask(task);
			poleRepository.save(pole);
		}
		return null;
	}

	@Override
	public Pole updatePole(Pole pole) {
		if(pole != null) {
			Pole pl = poleRepository.findById(pole.getId()).get();
			pl.setName(pole.getName());
			pl.setNbrPoles(pole.getNbrPoles());
			pl.setType(pole.getType());
			
			return poleRepository.save(pl);
		}
		return null;
	}

	@Override
	public Pole deletePole(Long id) {
		Optional<Pole> pole = poleRepository.findById(id);
		if(pole.isPresent()) {
			poleRepository.delete(pole.get());
			return pole.get();
		}
		return null;
	}

}
