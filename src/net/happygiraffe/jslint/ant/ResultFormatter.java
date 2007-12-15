package net.happygiraffe.jslint.ant;

import java.io.OutputStream;
import java.util.List;

import net.happygiraffe.jslint.Issue;

/**
 * Output all issues found somewhere. The calling sequence is:
 *
 * <ul>
 * <li>{@link #setOut(OutputStream)}
 * <li>{@link #begin()}
 * <li>{@link #output(List)}
 * <li>{@link #end()}
 * </ul>
 *
 * @author dom
 * @version $Id$
 */
public interface ResultFormatter {

    /**
     * Called at the start of {@link JSLintTask} execution.
     */
    public abstract void begin();

    /**
     * Called at the end of {@link JSLintTask} execution.
     */
    public abstract void end();

    /**
     * Called for each file that is checked by {@link JSLintTask}. There may be
     * zero issues.
     *
     * @param issues
     */
    public abstract void output(List<Issue> issues);

    /**
     * Called during initialization.
     *
     * @param os
     */
    public abstract void setOut(OutputStream os);

}