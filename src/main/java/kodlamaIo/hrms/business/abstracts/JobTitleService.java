package kodlamaIo.hrms.business.abstracts;

import java.util.List;

import kodlamaIo.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();
}
