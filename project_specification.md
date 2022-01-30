# Project Specification:

## What data structures and algorithms will you be using?

A chess piece class needs to be implemented first to record the position and the color of the chess piece. Then, JavaFX is used to render the UI of the chessboard and to provide the image of the steps user or machine has taken. A chess piece array is provided to simulate and record the taken chessboard.

The game should have two modes: one is human-to-human players, and another one is human-to-AI player. For the human-to-human mode, the core functionality is to realize the alternation of black and white colors. For the human-to-AI player, Minimax + alpha-beta pruning is used by the AI to calculate which step it should take. In both cases, method for checking the winning condition is needed.

Additional methods such as withdraw or repaint should also be provided.

## What problem are you solving and why did you chose these specific data structures and algorithms?

The purpose is to create a full-fledged Gomoku game. Mini-max and alpha-beta pruning are typical algorithms used to calculate the next best step.

## What is the program input and how it will be used?

The problem input is from the user's mouse. In JavaFX, there exists mouselistener and eventhandler to handle the external inputs. Each external click on the chessboard should create a chesspiece at that certain position on the chessboard.

## Expected time and space complexities of the program sources?

if n represents the number of grid in each row, then O(n^2) should be the time complexities, since the check method is run in two for loops. The point of this AI is to minimize the searches at this depth as much as possible, so the time complexity for the alpha-beta pruning algorithm remains undecided yet.

the space complexity should be O(n^2).

## Degree?

Bachelor's programme in Science.

## Documentation language?

English.
