package io.vokal.lint.registry;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;
import io.vokal.lint.detectors.*;

import java.util.Arrays;
import java.util.List;

/**
 * The list of issues that will be checked when running <code>lint</code>.
 */
@SuppressWarnings("unused")
public class CustomIssueRegistry extends IssueRegistry {

    private List<Issue> mIssues = Arrays.asList(
            RxLifecycleDetector.ISSUE
    );

    public CustomIssueRegistry() {
    }

    @Override
    public List<Issue> getIssues() {
        return mIssues;
    }

}
