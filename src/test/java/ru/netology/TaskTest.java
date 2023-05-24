package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void testMatchesForSimpleTaskWhenTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("родителям");
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    public void testMatchesForSimpleTaskWhenFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("бабушке");
        boolean expected = false;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTitle() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        String expected = "Позвонить родителям";
        String actual = simpleTask.getTitle();

        assertEquals(actual, expected);
    }

    @Test
    public void testMatchesForEpicTaskWhenTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    public void testMatchesForEpicTaskWhenFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Огурец");
        boolean expected = false;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowSubtasks() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        String[] expected = subtasks;
        String[] actual = epic.getSubtasks();

        assertEquals(actual, expected);
    }

    @Test
    public void testMatchesForMeetingTopicTaskWhenTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Выкатка");
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    public void testMatchesForMeetingTopicTaskWhenFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Обсуждение");
        boolean expected = false;

        assertEquals(actual, expected);
    }

    @Test
    public void testMatchesForMeetingProjectWhenTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение");
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    public void testMatchesForMeetingProjectWhenFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Сайт");
        boolean expected = false;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String expected = "Выкатка 3й версии приложения";
        String actual = meeting.getTopic();

        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String expected = "Приложение НетоБанка";
        String actual = meeting.getProject();

        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowStart() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String expected = "Во вторник после обеда";
        String actual = meeting.getStart();

        assertEquals(actual, expected);
    }
}
