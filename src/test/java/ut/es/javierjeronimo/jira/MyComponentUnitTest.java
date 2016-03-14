package ut.es.javierjeronimo.jira;

import org.junit.Test;
import es.javierjeronimo.jira.api.MyPluginComponent;
import es.javierjeronimo.jira.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}