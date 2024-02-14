# Recursive Maze Solver

This program is designed to solve mazes represented in text files using a recursive algorithm. The mazes it solves are composed of 4 different characters, "X" for walls, " " for movable space, "+" for the starting position, and "-" for the ending position. In addition, a line is above the very maze that consists of two sets of numbers representing the number of rows and columns respectively.

This program prompts the user for a file they would like to solve. This program then recurvisely solves said maze, moving through the program using the "+" character to mark its current path and "." to mark dead ends. Upon reaching the end, the markings are cleared and "@" symbols are used to mark the path out of the maze, which is promptly printed to console.
