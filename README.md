A* Search written in Java.
=============================

This A* Search is written in an abstract manner, that is independant of 
the implementation of the ModelState etc.

To prove this A* Search is independant of implementation, two different 
implementations are provided:

1) Graph A* Search:
src/test/java/au/net/hal9000/ai/SearchAStarGraphTest.java

2) Grid A* Search:
src/test/java/au/net/hal9000/ai/SearchAStarGridTest.java

This is a Maven project with comprehensive unit tests.

mvn test
