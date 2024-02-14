# Recursive Maze Solver

This program is designed to solve mazes represented in text files using a recursive approach. The mazes it solves are composed of 4 different characters, "X" for walls, " " for movable space, "+" for the starting position, and "-" for the ending position. In addition, a two numbers representing the number of rows and columns respectively are placed in a line above the maze.

## How it Works

This program prompts the user for a file they would like to solve. Then, the program attemps to solve the maze, moving through the program using the "+" character to mark its current path and "." to mark dead ends. Upon reaching the end, the markings are cleared and "@" symbols are used to mark the path out of the maze, which is promptly printed to console.
