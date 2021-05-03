package singleResponsibilityPrinciple.service;

import singleResponsibilityPrinciple.model.EmailInfo;

public interface IEmailService {
    void sendEmail(EmailInfo emailInfo);
}
