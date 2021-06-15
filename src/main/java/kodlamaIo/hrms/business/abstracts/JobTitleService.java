package kodlamaIo.hrms.business.abstracts;

import java.util.List;

import kodlamaIo.hrms.core.utilities.results.DataResult;
import kodlamaIo.hrms.core.utilities.results.Result;
import kodlamaIo.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	DataResult<List<JobTitle>> getAll();
	
	Result add (JobTitle jobtitles);
}
