/*
 * Copyright 2014 Steve Jones. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.github.sjones4.youcan.youtoken;

import com.amazonaws.auth.AWSCredentials;

/**
 *
 */
public class PasswordCredentials implements AWSCredentials {

  private final String accountName;
  private final String userName;
  private final char[] password;

  public PasswordCredentials( final String accountName,
                              final String userName,
                              final char[] password ) {
    this.accountName = accountName;
    this.userName = userName;
    this.password = password;
  }

  public String getAWSAccessKeyId() {
    return null;
  }

  public String getAWSSecretKey() {
    return null;
  }

  public String getAccountName() {
    return accountName;
  }

  public String getUserName() {
    return userName;
  }

  public char[] getPassword() {
    return password;
  }

  public void clear() {
    if ( password != null ) {
      for ( int i = 0; i < password.length; i++ ) {
        password[i] = 0;
      }
    }
  }
}
