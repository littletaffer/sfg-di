# Lesson: Introduction to JetBrains AI

## JetBrains AI

What are active profiles in Spring Boot? Explain the use cases for active profiles. Provide examples for
using different databases and Docker deployments. Explain how profile-specific properties are set.

# Lesson: Using Spring Boot Active Profiles With Junie
## Junie
In the package `student.springframework.sfsdi.datasource.spring4`, examine the class `DiDataSource`. Based on this class
create a new class called `SpanishDiDataSource` which returns "hello world" in Spanish. Annotate the new class
with the profile of "spanish". Update the class `DiDataSource` with the profile not equal to "spanish".

Add a unit test to verify the controller DiController returns "hello world" in Spanish when the "spanish" profile is
active. Use a SpringBootTest, do not use mocks for this test.

# Assignment: Create New Profile
## Junie
In the package `student.springframework.sfsdi.datasource.spring4`, examine the class `DiDataSource`. Based on this class
create a new class called `PolishDiDataSource` which returns "hello world" in Polish. Annotate the new class
with the profile of "polish". Update the class `DiDataSource` and add the profile not equal to "polish".

Add a unit test to verify the controller DiController returns "hello world" in Polish when the "polish" profile is
active. Use a SpringBootTest, do not use mocks for this test.
