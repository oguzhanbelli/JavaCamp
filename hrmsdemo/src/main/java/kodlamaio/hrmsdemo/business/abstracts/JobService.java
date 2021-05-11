package kodlamaio.hrmsdemo.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrmsdemo.entities.concretes.Job;

public interface JobService {

	List<Job> getAll();
   
	Optional<Job> getById(Long id);
}
