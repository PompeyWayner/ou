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
Map<String, String> u = new HashMap<>();
u.put("Wayne", "Pompey");
u.put("Nicki", "password");
u.put("Callie", "butterfly");
u.put("Bradley", "12345678");
u.put("Reece", "whatever");
u.put("Daniel", "55555555");

Set<String> w = new HashSet<>();
w.add("00000000");
w.add("password");
w.add("55555555");
w.add("PASSWORD");
w.add("12345678");
SortedPasswords sp = new SortedPasswords();
sp.findStrongPasswords(u,w);