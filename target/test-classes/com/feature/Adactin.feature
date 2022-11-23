Feature: Checking the hotel booking fucntionality Of Adactin application
Scenario: Login functionality
Given user Must Launch Url
When user Enters The Username In Username Field
And user Enters The Password In Password Field
Then user Clicks The Login Button And It Navigates To The Search Hotel Page

Scenario: Search functionality
When user Selects The Lacation From Location Field
And user Selects The Hotel From Hotel Field
And user Selects The RoomType From RoomType Field
And user Selects The Number Of Rooms From NOR Field
And user Enters CheckIn From CheckIn Field
And user Enters CheckOut From CheckOut Field
And user Selects NOA From NOA Field
And user Selects NOC From NOC Field
Then user Clicks The Search Button And It Navigates To The Select Hotel Page

Scenario: Select functionality
When user Click The Check Box In Check Box Field
Then user Clicks The Continue Button And It Navigates To The Book Hotel Page

Scenario: Book hotel functionality
When user Enters First Name In First Name Field
And user Enters Last Name In Last Name Field
And user Enters Billing Address In Billing Address Field
And user Enters CCNumber In CCNumber Field
And user Selects CCType From CCType Field
And user Selects CCExpiry Date From Date Field
And user Selects CCExpiry Year From Year Field
And user Enters CCVNumber In CCVNumber Field
Then user Clicks Book Now Button And It Navigates To The Booking Confirmation Page




