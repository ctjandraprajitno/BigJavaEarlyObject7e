
# BigJavaEarlyObject7e — Big Java: Early Objects (7e) exercise answers

This repository contains solutions for selected exercises from the book "Big Java: Early Objects (7th edition)". Examples are kept short and runnable so they demonstrate solutions clearly and can be compiled and executed easily.

## What is included

- Short Java programs that implement or demonstrate solutions to exercises from the book.
- A simple, flat layout (examples are in `module(n)/` with (n) being module number, grouped by exercise number).
- A permissive license (CC0) included at the repository root.

## Project layout (partial)

- `module2/` — exercises for Chapter/Module 2
	- `E210/BrighterDemo.java` — Color.brighter() demo
	- `E213/DieSimulator.java` — simple die roll simulator
	- `E215/PointTester.java` — (empty skeleton for Point exercise)
	- `E22/StringClassPractice.java` — String.trim() and replace demo
- `labs/` — extra lab files (may be ignored by .gitignore)
	- `GregorianCalendarTime.java`
- `TechComp/Tech Competency 1 TJANDRAPRAJITNO/HelloWorld.java` — miscellaneous

This README lists some exercise files present at the time of writing. Refer to the repository tree for the current and complete set of files.

## How to compile and run an example

The examples are plain Java classes in the default package. Use the JDK from a bash shell (Windows git-bash or WSL) or an IDE. From the repository root:

Compile a single file:

```bash
javac module2/E213/DieSimulator.java
```

Run the compiled class (the classpath should point to the directory that holds the .class file):

```bash
java -cp module2/E213 DieSimulator
```

Alternatively, compile multiple files at once or use an IDE (IntelliJ IDEA, Eclipse, VS Code + Java extension).

## Recommended workflow

- Keep each exercise's solution in a small, self-contained `.java` file.
- Add a short comment at the top describing which exercise the file implements and any assumptions made.
- When an exercise requires multiple supporting classes, place them in the same directory.

## Notes about packaging and classpaths

These examples use the default (unnamed) package for simplicity. When refactoring into packages:

- Add a `package` declaration at the top of each `.java` file.
- Adjust the directory structure to match the package (for example `com/you/module/Example.java`).
- Run `javac` from the repository root and use the repository root as the classpath when running `java`.

## .gitignore and included files

The repository includes a `.gitignore` that ignores the `labs/` and `techcomp/` folders by default. Those folders are reserved for owner's CSCI111 class assignment. Update `.gitignore` if additional files in more folders should be tracked. Do not remove the default setup.

## License

A `LICENSE` file is included at the repository root. The license is CC0 / public-domain dedication.

## Contributing and additions

This repository serves as a personal exercise log. Examples and code may be reused or modified; if modified, consider leaving a short note or star.

To request additions or changes, open an issue or submit a pull request.

---

Exercise answers for "Big Java: Early Objects (7e)
