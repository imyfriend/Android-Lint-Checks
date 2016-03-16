package io.vokal.lint.registry;

import com.android.tools.lint.detector.api.Issue;

import io.vokal.lint.detectors.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test the {@link CustomIssueRegistry}
 */
public class CustomIssueRegistryTest {

    private CustomIssueRegistry mCustomIssueRegistry;

    /**
     * Setup for the other test methods
     */
    @Before
    public void setUp() throws Exception {
        mCustomIssueRegistry = new CustomIssueRegistry();
    }

    /**
     * Test that the issue registry contains the correct number of issues
     */
    @Test
    public void testNumberOfIssues() throws Exception {
        int size = mCustomIssueRegistry.getIssues().size();
        assertThat(size).isEqualTo(1);
    }

    /**
     * Test that the issue registry contains the correct issues
     */
    @Test
    public void testGetIssues() throws Exception {
        List<Issue> actual = mCustomIssueRegistry.getIssues();
        assertThat(actual).contains(RxLifecycleDetector.ISSUE);
    }

}
