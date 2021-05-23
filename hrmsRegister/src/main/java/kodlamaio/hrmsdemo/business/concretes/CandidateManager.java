package kodlamaio.hrmsdemo.business.concretes;

import kodlamaio.hrmsdemo.business.abstracts.CandidateService;
import kodlamaio.hrmsdemo.core.utilities.results.*;
import kodlamaio.hrmsdemo.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrmsdemo.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
    @Autowired
    private CandidateDao candidateDao;
    @Autowired
    private ValidationService validationService;

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Data Listelendi");


    }

    @Override
    public Result add(Candidate candidate) throws Exception {
        if (validationService.candidateValidations(candidate)) {
            if (validationService.validEmailCan(candidate)) {
                this.candidateDao.save(candidate);
                return new SuccessResult("Mail Onaylanıp Eklendi");
            }
            this.candidateDao.save(candidate);
            return new SuccessResult("Başarıyla Eklendi Mailini Kontrol Et");
        } else {

            return new ErrorResult("Hatalı Giriş");
        }

    }

}
