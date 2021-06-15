package kodlamaIo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaIo.hrms.business.abstracts.JobTitleService;
import kodlamaIo.hrms.core.utilities.results.DataResult;
import kodlamaIo.hrms.core.utilities.results.Result;
import kodlamaIo.hrms.core.utilities.results.SuccessDataResult;
import kodlamaIo.hrms.core.utilities.results.SuccessResult;
import kodlamaIo.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaIo.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Data Listelendi");
	}
	
	@Override
	public Result add(JobTitle titles) {
		this.jobTitleDao.save(titles);
		return new SuccessResult("İş Başlığı Eklendi");
	}

}
