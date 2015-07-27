you-are-sdk
===========
Extension of the AWS Java SDK with Eucalyptus specific functionality.

To build run:
 
  gradlew jar

The following clients are included:

* YouAreClient - IAM extension with account management support
* YouConfigClient - Eucalyptus administrative client supporting component listing
* YouPropClient - Eucalyptus administrative client with property management support
* YouServClient - Eucalyptus administrative client with service describe support
* YouTokenClient - IAM/STS extension with impersonation and password token support
* YouTwoClient - EC2 extension with instance type describe support

[![Build Status](https://drone.io/github.com/sjones4/you-are-sdk/status.png)](https://drone.io/github.com/sjones4/you-are-sdk/latest)

