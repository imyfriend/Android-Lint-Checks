package io.vokal.lint.todo.registry;

import java.util.Collections;
import java.util.List;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;

import io.vokal.lint.todo.detectors.TodoDetector;

/**
 * The list of issues that will be checked when running <code>lint</code>.
 */
@SuppressWarnings("unused")
public class CustomIssueRegistry extends IssueRegistry {

    private List<Issue> mIssues = Collections.singletonList(TodoDetector.ISSUE);

    public CustomIssueRegistry() {}

    @Override
    public List<Issue> getIssues() {
        return mIssues;
    }

}
