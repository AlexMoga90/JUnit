![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)

# Basics of programming in Java
> Important information

Read the following instructions before you start solving the exercises and tasks.

## How to get started?

1. Create a [*fork*](https://guides.github.com/activities/forking/) of the repository with exercises.
2. Clone the repository to your computer. Use the `git clone repository_address` command to do this.

You can find the repository address on the repository page by clicking the "Code" button.

Make sure to use the address of your own fork, it should look like this:
`https://github.com/your-login/repository_name`


3. Import the project as a `Maven` project, according to the instructions below:

	* In `IntelliJ` select: `File –> New –> Project from Existing Sources...`
	* Point to the location of the directory with the cloned project and confirm.
	* Then, in a new window choose: `Import project from external model` and indicate `Maven`
	* Select ` Finish`, (in `IntelliJ` before 2020: `Next –> Next –> Next –> Finish`);

4. Solve the exercises and tasks and commit the changes to your repository. Use the commands `git add file_name`.
If you want to add all changed files at once use `git add .` 
Remember that the dot at the end is important!
Then commit the changes with the command `git commit -m "description of changes"`
5. Push the changes to your GitHub repository.  Use the command `git push origin master` to do this.
For repositories created after October 1, 2020 `git push origin main`.
6. Create a [*pull request*](https://help.github.com/articles/creating-a-pull-request) to the original repository when you have completed all exercises.


**The repository with the exercises will be deleted 2 weeks after the end of the course. This will also remove all forks that are made from this repository.**


## Exercise 1 - done with the lecturer

1. Import the `Maven` project.
2. Create a test class called `SimpleSampleTest`.
4. Run the test and then correct it in any chosen way so that the test passes.


## Exercise 2 - done with the lecturer

1. Create 2 random test classes with at least one test in each.
2. Create a `Test Suite` for the classes you created.
3. Run and test the operation.


## Exercise 1 - done with the lecturer

1. Create a `Calculator.java` class that will implement four mathematical operations: 
	* adding,
	* subtraction,
	* multiplying,
	* dividing,
	* comparison of 2 values (boolean greater(int a, int b))

2. Create a `CalculatorTest.java` class that will implement tests for this class.


## Exercise 2

In the `SimpleCalculatorTest.java` file:

1. Create tests for the `SimpleCalculator.java` class methods;
2. Create a test to check for an exception.


## Exercise 3

1. In the `MaxValue.java` class there is a method that searches for the highest value in an array.
2. Write tests for this function and check the correctness of indications.
3. If necessary, correct the implementation of the method.


## Exercise 4

1 Create a `Calculator.java` class that implements four mathematical operations
* addition
* subtraction
* multiplication
* division
* comparison of 2 values (boolean greater(int a, int b))

2 Create a `CalculatorTest.java` class that will implement the tests for this class.


## Exercise 5

1. Complete the testing class with the following test:
````java
@Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.eval("1+2+3");
    assertEquals(6, sum);
  }

````
2. Add an implementation of the method to the `Calculator` class so that the test is successful.


## Exercise 1 - done with the lecturer

Write a `User` class and a `UserRepository` class implementing the following features:
  1. Creating a user.
  2. Editing a user.
  3. Removing a user.

Write a test class for `UserRepository`.
Write this exercise using the full TDD methodology.


## Exercise 2 - done with the lecturer

Write a `Factors` class having one static method named ```generatePrimeFactors(n)``` that will generate
all dividers of the given number ```n``` in numerical order (from the smallest).

Write this exercise using the full TDD methodology.

Perform a commit for each of the 3 stages of the process, that is:
- after writing the tests
- after writing the code
- after refactoring


## Exercise 3

1. Write a class `Circle` with one public method ```circleArea(r)``` that returns the calculated area of the circle with a radius of `$r`.
2. If a negative value is given for the `r` argument, the method should throw an exception.
3. The result should be rounded **up** to `2` decimal places.

Write this exercise using the full TDD methodology.

Perform a commit for each of the 3 stages of the process, that is:
- after writing the tests
- after writing the code
- after refactoring
