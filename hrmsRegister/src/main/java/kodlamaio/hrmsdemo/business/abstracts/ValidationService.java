package kodlamaio.hrmsdemo.business.abstracts;

import kodlamaio.hrmsdemo.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrmsdemo.entities.concretes.Candidate;
import kodlamaio.hrmsdemo.entities.concretes.Employer;

public interface ValidationService {
    boolean mailIdentityExist(Candidate candidate);
    boolean mailExistEmployer(Employer employer);
    boolean validEmailEmp(Employer employer);
    boolean validEmailCan(Candidate candidate);
    boolean mernisCandidate(Candidate candidate) throws Exception;
    boolean requiredEmployer(Employer employer);
    boolean requiredCandidate(Candidate candidate);
    boolean employerValidations(Employer employer);
    boolean candidateValidations(Candidate candidate) throws Exception;
}
