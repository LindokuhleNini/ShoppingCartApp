# ShoppingCartApp
Shopping Cart command-line application

This application has been implmented as a command-line appliction. The main method is in ShoppingCartApp.java

How to run program:
Open a command prompt window and go to the directory where you saved the java program (ShoppingCartApp.java)
Type 'javac ShoppingCartApp.java'
Then type ' java ShoppingCartApp ' to run the program.

How the application works:
When running, the application will show a menu with a list of the three different Pizza's (Regina Pizza, Hawaiian Pizza, Mediterranean Pizza).
ShoppingCartApp.java has been implemented to read the input and invoke the appropriate method. 

The scanner objects only accepts integer values. The user should enter the number of the option they want to select.
Example:
1. Regina Pizza
2. Hawaiian Pizza
3. Mediterranean Pizza
6. Terminate
In order to select Regina Pizza, you should input the integer 1. Option 6 will terminate the application.

After selecting Regina Pizza from the menu above and pressing enter, a new menu will appear with a list of different types of the Regina Pizza with prices
Example:
1. Small Pizza R80
2. Medium R110
3. Large R135
4. Terminate

After the user makes a selection from the above menu, the application will ask the user if they want toppings or not. If you say yes, the following menu will appear:
1. Cheddar Cheese R20.90
2. Mushrooms R25.90
3. Olives R25.90
4. Avocado R32.90
5. Pineapple R20.90
6. Done
The user can select up to 3 toppings and select done once finished. 
The application will add the price of the pizza with the total cost of the toppings to calculate the amount owing.

Afterwards, this menu will appear:
1. Items on cart
2. Add more pizza
Option 1 will display all the items on the shopping cart
Option 2 will allow the user to add another pizza on the cart.

The application will run in a loop until you select the terminate option from the menus.
