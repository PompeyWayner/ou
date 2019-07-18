------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

//test code

Entrant e1 = new Entrant();
Entrant e2 = new Entrant();
Entrant e3 = new Entrant();

WCCR rally = new WCCR();

rally.readInEntrants(); // navigate to entrants.txt file when prompted

// set generateTime() temporarily to public to test it here
rally.generateTime();

rally.runRally();

rally.sortEntrantList();

rally.categorise();

