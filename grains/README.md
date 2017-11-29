# Grains

Write a program that calculates the number of grains of wheat on a chessboard given that the number on each square doubles.

There once was a wise servant who saved the life of a prince. The king
promised to pay whatever the servant could dream up. Knowing that the
king loved chess, the servant told the king he would like to have grains
of wheat. One grain on the first square of a chess board. Two grains on
the next. Four on the third, and so on.

There are 64 squares on a chessboard.

Write code that shows:

- how many grains were on each square, and
- the total number of grains


## For bonus points

Did you get the tests passing and the code clean? If you want to, these
are some additional things you could try:

- Optimize for speed.
- Optimize for readability.

Then please share your thoughts in a comment on the submission. Did this
experiment make the code better? Worse? Did you learn anything from it?

For installation and learning resources, refer to the
[exercism help page](http://exercism.io/languages/groovy).

Run the tests by executing the test script.

```
$ groovy ./GrainsSpec.groovy
```

After the first test(s) pass, continue by commenting out or removing the `@Ignore` annotations prepending other tests.

When all tests pass, congratulations!
=======
These instructions assume you have installed exercism, Groovy, Java, and have an available IDE (this guide uses IntelliJ IDEA). If you run into trouble, consult the exercism docs on [Groovy](http://exercism.io/languages/groovy), or send us an issue on GitHub.

## Fetch the exercise

In a Command Prompt or Terminal, fetch the first exercise.

```
C:\Users\You>exercism fetch groovy

Not Submitted:       1 problem
groovy (Hello World) Path\To\Your\Exercism\groovy\hello-world

New:                 1 problem
groovy (Hello World) Path\To\Your\Exercism\groovy\hello-world

unchanged: 0, updated: 0, new: 1
```

## Import the exercise

1) Start IntelliJ IDEA. In the "Welcome to IntelliJ IDEA" window, click the "Open" option.

2) Navigate to the "Path\To\Your\Exercism\groovy\THIS_EXERCISE" folder.  Make sure you've selected the root directory of the exercise. Click "OK".

3) Follow the dialog for creating the project from existing external sources.

4) IntelliJ will then create a new project structure in the editor for your exercise.

5) Depending on how much of the IDE you have configured before, you will likely need to add a Groovy SDK and a Java SDK (JDK 7+, ideally). These can be configured through the project/module settings by right clicking on the imported project.

6) You may also need to configure the location of the compiler output (exercism doesn't provide all IDE files since you could work the problems in a myriad of editors instead). This can be configured in the project settings as well.

## Start the exercise

1) Open the `README.md` file and carefully read the background for the assignment.

2) Start by running the test suite: In the "Project" view, right-click on the test file (`hello-world\HelloWorldTest.groovy`), select "Run", then pick the "HelloWorldTest" that has a JUnit icon to the left of it (red and green arrows).

3) The tests are designed to fail at the beginning. Each exercise will expect you to update the associated groovy file (named the same as the test without the ````Tests```` suffix in the filename.

4) To skip a test, you can add the @Ignore annotation a test method:

````
  //This test will run.
  @Test
  void testNoName() {
    assertTrue new HelloWorld().hello() == 'Hello, World!'
  }

  //this test will be skipped.
  @Test
  @Ignore
  void testSampleName() {
    assertTrue new HelloWorld().hello('Alice') == 'Hello, Alice!'
  }
````

Alternatively, you can simply comment out an entire method to have it removed from compilation and being included in test output.

5) Update the main Groovy code and re-run the tests until they pass.

## Source

JavaRanch Cattle Drive, exercise 6 [http://www.javaranch.com/grains.jsp](http://www.javaranch.com/grains.jsp)

## Submitting Incomplete Solutions
It's possible to submit an incomplete solution so you can see how others have completed the exercise.
