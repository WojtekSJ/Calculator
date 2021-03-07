package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Task to add to list";
    private static final String NAME1 = "List no 1";
    @Test
    void testTaskDaoSave() {
        //Given
        TaskList taskList = new TaskList(NAME1, DESCRIPTION);


        //When
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //Then
        int id = taskList.getId();

        List<TaskList> readTaskList = taskListDao.findByListName(name);
        assertEquals(1, readTaskList.size());

        //CleanUp
        taskListDao.deleteById(id);
    }
}
