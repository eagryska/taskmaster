package com.allstate.repositories;

import com.allstate.models.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Integer>{
}
