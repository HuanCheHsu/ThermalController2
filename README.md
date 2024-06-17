# ThermalController2

General Goals
Smart Home Controller: Successfully integrates sensors and actuators from different vendors using the provided SSDCS Java Interfaces.
Exercise 1
Class Diagram: A detailed class diagram created with draw.io that accurately represents the SSDCS structure, showing the relationships between different interfaces and classes.
Exercise 2
Room.java:

Models a room and tracks installed devices.
Maintains a list of sensors and actuators within the room.
Building.java:

Represents a collection of rooms.
Includes the furnace as part of the building.
Controller.java:

Acts as the central control unit.
Collects data from sensors (temperature readings).
Sends commands to actuators (furnace) based on hardcoded logic to maintain desired temperature levels.
QuickThermostat.java:

Provides a basic implementation of a thermostat for testing and integration purposes.
Simulates user interactions to set desired temperature.
Main.java:

Builds the smart apartment by initializing rooms and devices.
Sets up the sensors in the living room and bedroom.
Integrates the furnace and connects it with the controller.
Ensures the entire system works together to control the apartment's temperature.
Scenario Compliance:

The system is capable of running any scenario provided by the instructor, demonstrating flexibility and robustness.
Exercise 3
ThermoSetX19 Thermostat:

Implements the SSDCS-compliant thermostat interface.
Provides functionality for users to set their desired temperature.
Integrates seamlessly with the GUI plug-in to offer a user-friendly interface.
GUI Integration:

The thermostat is fully integrated with the provided GUI plug-in, allowing users to interact with the thermostat through a graphical interface.
Ensures the thermostat's front end is functional and user-friendly.
JavaDoc Documentation:

Comprehensive documentation generated for the ThermoSetX19 thermostat.
Includes details about its implementation, usage, and integration points.
