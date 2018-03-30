package ua.shalin.springsecurityapp.service;


import ua.shalin.springsecurityapp.model.Issue;

import java.util.List;

public interface IssueService {

    public void addIssue(Issue Issue);

    public List<Issue> getAllIssues();

    public void deleteIssue(Long IssueId);

    public Issue getIssue(Long IssueId);

    public List<Issue> getIssueByUser(String name);

    public Issue updateIssue(Issue issue);
}
