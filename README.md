
    Unit test and mocking dependent class in java

When we refactor/ write test case for existing code  we would face some challenges  to mock the behaviour  of  dependent class .

This  public repo we are adding example for those special case where the solution is  not straight forward when we were writing test case .

 Added following cases
   * Spy private method inside the class
   * Spy public method inside the class
   * Mock static declaration like  (Log4j and more )
   * Mock singleton class  instance behaviour .



Prerequisite :
     This is a gradle project you must have gradle install your computer.

  Setup :

     Clone/Download the project to your local directory :

     Run - gradle test

     Visit - build/reportHtml/index.html  for code coverage report .






