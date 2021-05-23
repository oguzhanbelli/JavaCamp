package kodlamaio.hrmsdemo.business.concretes;

import kodlamaio.hrmsdemo.business.abstracts.ValidationService;
import kodlamaio.hrmsdemo.core.utilities.results.ErrorResult;
import kodlamaio.hrmsdemo.core.utilities.results.Result;
import kodlamaio.hrmsdemo.core.utilities.validations.Validations;
import kodlamaio.hrmsdemo.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrmsdemo.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrmsdemo.entities.concretes.Candidate;
import kodlamaio.hrmsdemo.entities.concretes.Employer;
import kodlamaio.hrmsdemo.mernisservice.NKHKPSPublicSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.text.ParseException;

@Service
public class ValidationManager implements ValidationService {
    private EmployerDao employerDao;

    @Autowired
    public ValidationManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Autowired
    private CandidateDao candidateDao;

    public ValidationManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }


    @Override
    public boolean mailIdentityExist(Candidate candidate) {
        if (this.candidateDao.existsByEmailAdress(candidate.getEmailAdress()) && this.candidateDao.existsByIdentificationNumber(candidate.getIdentificationNumber())) {


            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean mailExistEmployer(Employer employer) {
        if (this.employerDao.existsEmployerByEmailAdress(employer.getEmailAdress())) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean validEmailEmp(Employer employer) {
        return false;
    }

    @Override
    public boolean validEmailCan(Candidate candidate) {
        return false;
    }

    @Override
    public boolean mernisCandidate(Candidate candidate) throws Exception {
        NKHKPSPublicSoap publicSoap = new NKHKPSPublicSoap();
        boolean check = false;
        try {
            check = publicSoap.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentificationNumber()), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate().toLocalDate().getYear());
        } catch (NumberFormatException | RemoteException e) {
            e.printStackTrace();
        }
        return check;
    }


    @Override
    public boolean requiredEmployer(Employer employer) {
        if (employer.getCompanyName().isEmpty() && employer.getWebAddress().isEmpty() && employer.getEmailAdress().isEmpty() && employer.getPassword().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean requiredCandidate(Candidate candidate) {
        if (candidate.getFirstName().isEmpty() && candidate.getLastName().isEmpty() && candidate.getEmailAdress().isEmpty() && candidate.getBirthDate() == null && candidate.getIdentificationNumber().isEmpty() && candidate.getPassword().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean employerValidations(Employer employer) {
        boolean employerValidation = Validations.run(requiredEmployer(employer), mailExistEmployer(employer));
        return employerValidation;
    }

    @Override
    public boolean candidateValidations(Candidate candidate) throws Exception {
        boolean candidateValidation = Validations.run(requiredCandidate(candidate), mernisCandidate(candidate), mailIdentityExist(candidate));
        return candidateValidation;
    }
}