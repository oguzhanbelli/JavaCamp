package kodlamaio.hrmsdemo.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsdemo.business.abstracts.JobService;
import kodlamaio.hrmsdemo.dataAccess.abstracts.JobDao;
import kodlamaio.hrmsdemo.entities.concretes.Job;

@Service

public class JobManager implements JobService {
	private JobDao jobDao;

	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		return this.jobDao.findAll();

	}

	@Override
	public Optional<Job> getById(Long id) {
		// TODO Auto-generated method stub
		return this.jobDao.findById(id);
	}

}
