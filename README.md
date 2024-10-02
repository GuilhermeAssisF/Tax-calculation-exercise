# Product and Service Price Calculator

## Overview
This Java project calculates the final price of products and services, taking into account taxes and fees such as ICMS, ISS, IPI, and freight. The program provides a simple console interface where users can input details about a product or service, including destination and initial price, and receive the calculated final price.

## Features
- Calculate final price for **Products** (with freight, IPI, and insurance).
- Calculate final price for **Services** (with ISS).
- Supports different destination regions that impact tax calculations.
- Console-based input/output.

## How It Works
1. The user inputs the product or service details:
   - Name
   - Initial price
   - Destination (Rio de Janeiro or Distrito Federal)
   - Freight (for products only)
2. The program applies relevant taxes based on the type (product or service) and calculates the final price.
3. The final price is displayed, including the total tax and a profit margin of 30%.

## Classes
- **BaseCalculator**: Abstract class that provides basic tax calculation methods (ICMS).
- **Product**: Extends `BaseCalculator`, adds calculations for freight, insurance, IPI, and final price for products.
- **Service**: Extends `BaseCalculator`, adds ISS tax calculation and final price for services.
- **Program**: Main class that interacts with the user, gathers input, and invokes calculations for products and services.

## How to Run
1. Clone or download the project to your local machine.
2. Open the project in your preferred Java IDE (e.g., NetBeans, IntelliJ IDEA).
3. Run the `Program` class to start the application.
4. Follow the console prompts to input the details and view the final price calculation.


## Requirements
- Java 8 or higher
- Java IDE (NetBeans, IntelliJ, Eclipse, etc.)


## AI-generated Read.me
