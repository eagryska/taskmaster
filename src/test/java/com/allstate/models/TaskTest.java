package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class TaskTest {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAnInstanceOfTask() throws Exception {
        Task task = new Task();
        assertThat(task, instanceOf(Task.class));
        assertTrue(task.getCreatedAt().getTime() > 0);
        assertTrue(task.getUpdatedAt().getTime() > 0);
    }

    @Test
    public void shouldGetAndSetId () throws  Exception{
        Task t = new Task();
        t.setId(3);
        assertEquals(3,t.getId());
    }

    @Test
    public void shouldGetAndSetName () throws Exception {
        Task task = new Task();
        task.setName("Get Milk");
        assertEquals("Get Milk", task.getName());
    }

    @Test
    public void shouldGetAndSetCategory () throws Exception {
        Task task = new Task();
        task.setCategory("Category");
        assertEquals("Category", task.getCategory());
    }

    @Test
    public void shouldGetAndSetDue () throws Exception {
        Task task = new Task();
        task.setDue(simpleDateFormat.parse("2012-03-11"));
        assertEquals("Sun Mar 11 00:00:00 CST 2012", task.getDue().toString());
    }

    @Test
    public void shouldGetAndSetIsComplete () throws Exception {
        Task task = new Task();
        task.setIsComplete(true);
        assertTrue(task.getIsComplete());
    }

    @Test
    public void shouldGetAndSetCreatedAt() throws  Exception{
        Task task = new Task();
        task.setCreatedAt(simpleDateFormat.parse("2012-03-11"));
        assertEquals("Sun Mar 11 00:00:00 CST 2012", task.getCreatedAt().toString());
    }

    @Test
    public void shouldGetAndSetUpdatedAt() throws  Exception{
        Task task = new Task();
        task.setUpdatedAt(simpleDateFormat.parse("2012-03-11"));
        assertEquals("Sun Mar 11 00:00:00 CST 2012", task.getUpdatedAt().toString());
    }

    @Test
    public void shoulUpdatetheTime() throws  Exception{
        Task task = new Task();
        task.setUpdatedAt(null);
        task.UpdateTime();
        assertTrue(task.getUpdatedAt().getTime() > 0);
    }

}