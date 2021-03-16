package com.spring.taskManagement.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.taskManagement.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	public final static String TASK_PROJECT = "Select t from Task t where t.sector.id in(Select s.id from Sector s where s.project.id = :id)";
	public final static String TASK_USER = "Select t.id,t.name,t.description,t.startDate,t.releaseDate from Task t where t.user.id = :id";

	Task findByName(String name);
	@Query(TASK_PROJECT)
	List<Task> getTaskByPorjectId(@Param("id") Long id);
	List<Task> findBySectorProjectId(Long id);
	@Query(TASK_USER)
	List<Task> getTaskByUserId(@Param("id") Long id);
	Stream<Task> findByUserId(Long id);
}
