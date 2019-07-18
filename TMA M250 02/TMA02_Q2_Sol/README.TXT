------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: M250 TMA02 Q2
PURPOSE OF PROJECT:
VERSION or DATE: 12-01-19
HOW TO START THIS PROJECT:
AUTHORS: Wayne Sandford
USER INSTRUCTIONS:

Various test code

Manager m1 = new Manager("Kenny Jackett","1/1/1962","2017");
Manager m2 = new Manager();
FootballClub fc1 = new FootballClub("Portsmouth", "1898", m1);
FootballClub fc2 = new FootballClub("Liverpool");
FootballClub fc3 = new FootballClub("Liverpool", "1977", m2);
fc1.toString();
m1.toString();
fc1.getManagerYearOfBirth();
fc1.getManagerYearBecameManager();
fc1.setManagerYearOfBirth("9999");
fc1.setManagerYearBecameManager(2016);
m2.toString();
fc3.toString();
fc1.yearsManaged();
fc2.isOverHundred();
m1.getYearOfBirth();
m1.getYearBecameManager();
m1.setYearOfBirth("12/12/1999");
fc1.getName();
fc2.getYearFounded();
fc2.getManagerName();
m1.setName("KJ");
