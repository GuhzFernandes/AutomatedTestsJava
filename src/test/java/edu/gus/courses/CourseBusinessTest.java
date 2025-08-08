package edu.gus.courses;

import edu.gus.courses.services.CourseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CourseBusinessTest {
    CourseService service;
    CourseBusiness business;
    List<String> courses;

    @BeforeEach
    public void setUp() {
        service = mock(CourseService.class);
        business = new CourseBusiness(service);
        courses = Arrays.asList(
                "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker");


    }

    @Test
    public void testCoursesRelatedToSpring_When_UsingMock() {
        //Arrange
        when(service.retrieveCourses("Gustavo"))
                .thenReturn(courses);

        //Act
        var filteredCourses = business.retriveCoursesRelatedToSpring("Gustavo");

        //Assertion
        Assertions.assertEquals(4, filteredCourses.size());
    }
}
