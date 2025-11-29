Feature: Computers

Background:Login

Given i open demowebshop homepage
Scenario: Verify User is Able to order laptop product

When i search for product "laptop"
Then i should see "laptop" result
And i clicked product name
Then i should see the product page "laptop"
And i added "5" qantity
And clicked on addtocart button
And i mousehover to shopping cart hyperlink
And i clicked on gotocart button
And i verified the details of the product added



