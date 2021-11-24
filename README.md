## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com


#### Expectations
We will be evaluating
1. Naming conventions
2. Code readability
3. Code encapsulation
4. Code structure and organization
5. Quality of test cases
6. Variety  of testing types (examples: boundary, happy path, negative, etc) 


#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/


#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

Happy Path

1. 6 Slice Pizza order with 1 toppings and Credit card payment.
2. 8 Slice Pizza order with 2 topping and Credit card payment.
3. 10 Slice Pizza order with no toppings and Credit card payment.
4. 6 Slice Pizza order with no toppings and Cash payment.
5. 8 Slice Pizza order with 2 toppings and Cash payment.
6. 10 Slice Pizza order with 2 topping and Cash payment.
7. 6 Slice Pizza order with 2 toppings and Credit card payment with max quantitiy.
8. 6 Slice Pizza order with 2 toppings and Credit card payment with 0 quantitiy.



Defects

1. If you select pizza with no topping , Topping 1 and 2 field should be disable
2. Quantity should be a drop down with limited order of quanitity.
3. Quantity should take only be numeric value.
4. Cost is “NaN ” if you put any alpha-Numeric value in quantity.
5. Phone number is taking more digits than expected.
6. Phone number is taking the Alphabets.
7. No validation applied on the Email Field Example taking email with no @.
8. When you enter no name and phone number the message is wrong example name should be start with  Capital “N” Name. Phone number should be Phone and start with Capital letter.
9. Thank you Message comes up even the quantity is 0.
10. Message box doesn’t have any Header.
11. Credit card information is not coming when payment type is Credit card
12. When message box is open the behind screen should be disable.
13. Reset Button does not reset the values to default 







 

