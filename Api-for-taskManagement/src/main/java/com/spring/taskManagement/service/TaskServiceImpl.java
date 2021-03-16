package com.spring.taskManagement.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.taskManagement.model.AppUser;
import com.spring.taskManagement.model.Pole;
import com.spring.taskManagement.model.Sector;
import com.spring.taskManagement.model.State;
import com.spring.taskManagement.model.StudyType;
import com.spring.taskManagement.model.Task;
import com.spring.taskManagement.repository.AppUserRepository;
import com.spring.taskManagement.repository.PoleRepository;
import com.spring.taskManagement.repository.SectorRepository;
import com.spring.taskManagement.repository.StateRepository;
import com.spring.taskManagement.repository.StudyTypeRepository;
import com.spring.taskManagement.repository.TaskRepository;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private SectorRepository sectorRepository;
	@Autowired
	private StudyTypeRepository studyTypeRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private AppUserRepository appUserRepository;
	@Autowired
	private PoleRepository poleRepository;

	@Override
	public List<Task> getTasks() {
		return taskRepository.findAll();
	}

	@Override
	public Task getTask(Long id) {
		Optional<Task> task = taskRepository.findById(id);
		return task.isPresent() ? task.get() : null;
	}

	@Override
	public Task addTask(Task task) {

		Sector sector = sectorRepository.findById(task.getSector().getId()).get();
		StudyType studyType = studyTypeRepository.findById(task.getStudyType().getId()).get();
		State state = stateRepository.findById(task.getState().getId()).get();
		AppUser user = appUserRepository.findById(task.getUser().getId()).get();

		Task newTask = new Task();
		newTask.setName(task.getName());
		newTask.setDescription(task.getDescription());
		newTask.setStartDate(task.getStartDate());
		newTask.setReleaseDate(task.getReleaseDate());
		newTask.setSector(sector);
		newTask.setState(state);
		newTask.setStudyType(studyType);
		newTask.setUser(user);
		return  taskRepository.save(newTask);
	}

	@Override
	public Task updateTask(Task task) {
		Task oldeTask = taskRepository.findById(task.getId()).get();
		addPolesToTask(oldeTask, task.getPoles());
		return taskRepository.findById(task.getId()).get();
	}

	@Override
	public boolean deleteTask(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Task getTaskByName(String name) {
		return taskRepository.findByName(name);
	}

	@Override
	public List<Task> getTasksByProjectId(Long id) {
		return taskRepository.findBySectorProjectId(id);
	}

	public void addPolesToTask(Task task, List<Pole> poles) {
		poles.forEach(poleItem -> {
			poleItem.setTask(task);
			poleRepository.save(poleItem);
		});
	}

	@Override
	public List<Task> getTasksByUserId(Long id) {
		return taskRepository.findByUserId(id).map(taskItem -> {
			taskItem.setUser(null);
			return taskItem;
		}).collect(Collectors.toList());
		//return taskRepository.getTaskByUserId(id);
		//return null;
	}

}
