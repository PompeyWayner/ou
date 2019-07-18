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

//Code for the OUWorkspace to set up the 4 traffic lights
Circle w = new Circle();
TrafficLight wlight = new TrafficLight(w);
Circle e = new Circle();
TrafficLight elight = new TrafficLight(e);
Circle n = new Circle();
TrafficLight nlight = new TrafficLight(n);
Circle s = new Circle();
TrafficLight slight = new TrafficLight(s);

// create a traffic light system
TrafficSystem ts = new TrafficSystem(nlight, slight, elight, wlight);

// will need to temporarily set to public in order to test
//ts.setPositions();
//ts.cycleState();
//ts.colourAllLights();

ts.runLights(); // nothing happens because go is false
ts.setGo(true);
ts.runLights(); // now the lights cycle
ts.setGo(false); // note if runLights() is running then you get a message saying do you want to stop the workspace executing - yes.

ts.manualOverride(); // try non integer inputs and integers outside the range