Challenge 1: Eager Singleton for a Configuration Manager
Scenario: You’re building a system for a small business that uses a single configuration file (e.g., settings like tax rates or store hours). The configuration should be loaded once when the app starts and shared across all parts of the system.
Goal: Implement an eager Singleton to manage this configuration.
Steps:
Define the Class: Create a class called ConfigManager to hold configuration data (e.g., a simple key-value map or a few fields like taxRate).

Set Up the Instance: Declare a private, static, final instance of ConfigManager and initialize it immediately (eagerly) with some default values or by reading a file.

Restrict Creation: Make the constructor private so no one can create another instance.

Provide Access: Add a public static method (e.g., getInstance()) that returns the pre-created instance.

Test It: In a main method or test class, access the instance from two different “parts” of the app (e.g., a billing module and a reporting module) and verify it’s the same object (e.g., check object references or modify a value and see it reflected).

Learning Focus: Understand how eager initialization guarantees one instance without thread concerns, and see its simplicity in action.
Challenge 2: Lazy Singleton with Thread Safety for a Logger
Scenario: You’re designing a logging system for a web server. Multiple threads (e.g., handling user requests) need to write to a single log file. The logger should only be created when the first log message is written, but it must be thread-safe.
Goal: Implement a lazy Singleton with synchronization for the logger.
Steps:
Define the Class: Create a Logger class with a method like log(String message) that writes to a file or console.

Set Up the Instance: Declare a private, static instance variable (initially null).

Restrict Creation: Use a private constructor to prevent external instantiation.

Control Access: Write a public static method (e.g., getLogger()) that:
Marks the method as synchronized.

Checks if the instance is null, and if so, creates it.

Returns the instance.

Simulate Threads: Create a test with two or more threads (e.g., using Thread class or a simple loop) that call getLogger() and log messages simultaneously.

Verify: Ensure all threads use the same logger instance (e.g., check object identity or log output) and that no duplicate loggers are created.

Learning Focus: Grasp lazy initialization and how synchronization prevents race conditions in a multi-threaded environment.
Challenge 3: Enum Singleton for a Game Scoreboard with Reflection Awareness
Scenario: You’re building a simple game where a single scoreboard tracks the high score across all players. The scoreboard should be tamper-proof (e.g., resistant to reflection hacks) and easy to access.
Goal: Implement an enum Singleton for the scoreboard and explore its strengths.
Steps:
Define the Enum: Create an enum called Scoreboard with a single instance (e.g., INSTANCE).

Add Functionality: Include a field like highScore and methods like updateScore(int score) and getHighScore() within the enum.

Initialize: Set an initial highScore (e.g., 0) when the enum is defined.

Access It: In a main method or game loop, access the scoreboard via Scoreboard.INSTANCE and update/check the score from multiple “players.”

Test Reflection Resistance: (Optional, advanced) Try using reflection in a separate test to create another instance or modify the enum—observe that Java prevents this (you’ll hit an exception or limitation).

Validate: Confirm there’s only one scoreboard by updating the score from different parts of the “game” and checking consistency.

Learning Focus: Experience the enum’s simplicity and built-in safety, and understand why it’s reflection-proof compared to traditional Singletons.

