you-are-sdk
===========
Extension of the AWS Java SDK with Eucalyptus specific functionality.

To build run:
 
  gradlew jar

The following clients are included:

* YouAreClient - IAM extension with account management support
* YouBillClient - Eucalyptus client for programmatic billing
* YouConfigClient - Eucalyptus administrative client supporting component listing
* YouEc2ReportsClient - Eucalyptus client for EC2 usage reporting
* YouPropClient - Eucalyptus administrative client with property management support
* YouServClient - Eucalyptus administrative client with service describe support
* YouTokenClient - IAM/STS extension with impersonation and password token support
* YouTwoClient - EC2 extension with instance type describe support

[![Build Status](https://drone.io/github.com/sjones4/you-are-sdk/status.png)](https://drone.io/github.com/sjones4/you-are-sdk/latest)
[ ![Download](https://api.bintray.com/packages/sjones4/maven/com.github.sjones4%3Ayou-are-sdk/images/download.svg) ](https://bintray.com/sjones4/maven/com.github.sjones4%3Ayou-are-sdk/_latestVersion)
