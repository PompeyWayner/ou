------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: M250 TMA01 Q1
PURPOSE OF PROJECT: To answer TMA01 Q1
VERSION or DATE: 1.0
HOW TO START THIS PROJECT: Open the OUWorkspace in BlueJ
AUTHORS: M250 module team
USER INSTRUCTIONS: use the instructions below to test your code

RoomSafe room5safe = new RoomSafe();
room5safe.getPassword(); //checking constructor - Adminadmin1

room5safe.isValidLength("A123456"); // checking length at least 8 - false
room5safe.isValidLength("A1234567"); // valid length - true

room5safe.hasDigit("AdminadminA"); // contains at least one digit? - false
room5safe.hasDigit("Adminadmin1"); // contains at least one digit? - true

room5safe.hasUpperCase("adminadmin1"); // contains at least one upper case character? - false
room5safe.hasUpperCase("Adminadmin1"); // contains at least one upper case character? - true

room5safe.isValidPassword("a1abcdef"); // checking length and digit ok, uppercase not - false
room5safe.isValidPassword("Aabcdefg"); // checking length and uppercase ok, digit not - false
room5safe.isValidPassword("A123456"); // checking digit and uppercase ok, length not - false
room5safe.isValidPassword("A1234567"); // checking digit, uppercase and length all ok - true

room5safe.hasChanged(); // not yet changed so should be false
room5safe.setPassword("adminadmin"); // setting invalid password - The password adminadmin is not valid.
room5safe.getPassword(); // checking setter did not set it - Adminadmin1
room5safe.hasChanged(); // still not been changed so should be false
room5safe.setPassword("Adminadmin2"); // setting valid password - The password Adminadmin2 is valid.
room5safe.getPassword(); // checking setter did set it - Adminadmin2
room5safe.hasChanged(); // now it's been changed so should be true