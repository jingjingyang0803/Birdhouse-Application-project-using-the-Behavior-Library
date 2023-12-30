# birdhouse application

This is the Birdhouse Application project that uses the Behavior Library for defining bird behaviors. This application simulates a birdhouse with different types of birds, each with their own behaviors.

## Project Structure

The project includes the following main components, divided into two packages:

### birdhouse package:

- `BirdHouse.java`: This class creates a birdhouse that contains different types of birds.

  It includes an INSTANCE object for implementing the Singleton pattern.

  It also includes methods such as `addMallardDuck(String name)`, `addRedheadDuck(String name)`, `bigNoise()`, and `bigFly()`, which are used to add different types of ducks to the birdhouse and simulate their behaviors.

### ducks package:

- `Duck.java`: This is the base class for all types of ducks.
- `MallardDuck.java`, `RedheadDuck.javaRubberDuck.javaDecoyDuck.java`: These classes represent specific types of ducks.

Additionally, the `App.java` is located in the base directory.

## Getting Started

1. First, clone the Behavior Library project to your local machine:

   ```bash
   git clone https://github.com/jingjingyang0803/Behavior-Library-project-for-Birdhouse-application.git
   ```

2. Navigate to the Behavior Library project directory and install it to your local Maven repository:

   ```bash
   cd behavior-library
   mvn install
   ```

3. Next, clone the Birdhouse Application project to your local machine:

   ```bash
   git clone  https://github.com/jingjingyang0803/Birdhouse-Application-project-using-the-Behavior-Library.git
   ```

   Note: The Behavior Library and Birdhouse Application projects don't necessarily need to be in the same directory on your local machine. As long as you've installed the Behavior Library to your local Maven repository, the Birdhouse Application can access it from there, regardless of their respective directory locations.

4. Run the application by navigating to the project directory in your terminal and running the following commands:

   ```bash
   cd birdhouse-application
   mvn package
   java -jar target/birdhouse-1.0-SNAPSHOT.jar
   ```

   This will run the birdhouse application and simulate the behaviors of the birds in the birdhouse.

   ```
   Hello! Welcome to our BirdHouse!
   -------------------------
   MallardDuck Donald says quack.
   MallardDuck Hewey says quack.
   MallardDuck Scrooge says quack.
   RedheadDuck Reddi says quack.
   RubberDuck Rubby says Squeak.
   DecoyDuck Doco says << Silence >>.
   -------------------------
   MallardDuck Donald is flying.
   MallardDuck Hewey is flying.
   MallardDuck Scrooge is flying.
   RedheadDuck Reddi is flying.
   RubberDuck Rubby can't fly
   DecoyDuck Doco can't fly
   ```
