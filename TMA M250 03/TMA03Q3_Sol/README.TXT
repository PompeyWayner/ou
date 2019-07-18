------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: DeliveryRoutes
PURPOSE OF PROJECT: TMA03 Q3
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS: Wayne Sandford
USER INSTRUCTIONS: Can be used to test class in OU Workspace

DeliveryRoutes dr = new DeliveryRoutes();
dr.populate();

// Q3 part C
dr.printMap();

dr.printMapValue("Portsmouth"); // Key exists
dr.printMapValue("London"); // Key does not exist

// Test addMapEntry
// Creates Set of businesses that overides existing key and values
Set<String> someBusinesses = new HashSet<>();
someBusinesses.add("Kiosk News");
someBusinesses.add("Middle Way News");
someBusinesses.add("WHSmith");
dr.addMapEntry("Havant", someBusinesses); 

// Creates Set of businesses that are new
Set<String> someBusinesses = new HashSet<>();
someBusinesses.add("Mccolls");
dr.addMapEntry("Fareham", someBusinesses); // Add new key and values

//Q3 part D
dr.deleteEntry("Havant"); // Key exists
dr.deleteEntry("Brighton"); // Key does not exist

dr.addToValue("Portsmouth", "Gemini News");

// Creates Set of business names to be used as argument in selectValues()
Set<String> b = new HashSet<>();
b.add("Tesco");
b.add("WHSmith");
b.add("Falcon News");
b.add("Mccolls");
dr.selectValues(b); 
